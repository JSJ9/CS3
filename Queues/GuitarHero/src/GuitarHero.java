import java.util.Arrays;

public class GuitarHero {
	private final static String KEYBOARD = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' "; // characters in the keyboard

	public static void main(String[] args) {

		// array for guitar strings

		// has the keyboard. Have the same while loop and do the nextKeyThing().

		/**
		 * has the keyboard. Have the same while loop and do the nextKeyThing(). If it
		 * does then we look at the index of said key and then go to the array that is
		 * full of guitarstrings READ THE INSTRUCTIONS DUMBASS
		 */
		GuitarString[] values = new GuitarString[37]; //an array of GuitarStrings that corresponds with each character in keyboard

		
		//Populates the array with guitar string frequencies
		for (int i = 0; i < KEYBOARD.length(); i++) {
			values[i] = new GuitarString((double) 440 * Math.pow(2, ((double) i - 24) / 12));
		}
		
	
		//constantly runs
		while (true) {
			//if a key is typed
			if (StdDraw.hasNextKeyTyped()) 
			{
				//the key someone typed
				char key = StdDraw.nextKeyTyped();

				if (KEYBOARD.contains(key + "")) //if the keyboard key value is in the keyboard string
				{
					int indx = KEYBOARD.indexOf(key + ""); //find location of key in the string

					values[indx].pluck(); //use that same location to play the guitar string in the array
				}
			}
			
			double sample = 0;

			for (int i = 0; i < KEYBOARD.length(); i++) 
			{
				sample += values[i].sample(); //adds all of the guitar strings
			}

			StdAudio.play(sample); //plays the sample

			for (int i = 0; i < KEYBOARD.length(); i++) {
				values[i].tic(); //moves the music forward
			}

		}

	}

}
