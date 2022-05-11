public class GuitarString 
{
    private RingBuffer buffer; // ring buffer
    
    // YOUR OTHER INSTANCE VARIABLES HERE
    private int num;
    private int count;
    private final double ENERGY_DECAY_FACTOR = 0.994;
    private int SAMPLING_RATE = 44100;
    
    /** create a guitar string of the given frequency */
    public GuitarString(double frequency) {
    	
    	num = SAMPLING_RATE/(int)frequency;
        buffer = new RingBuffer((int)44100/(int)frequency);
        
        for(int i = 0; i < num; i++)
        	buffer.enqueue(0);
        
        count = 0;
        
    }

    /** create a guitar string with size & initial values given by the array */
    public GuitarString(double[] init) {
    	buffer = new RingBuffer(init.length);
    	for(double i : init)
    		buffer.enqueue(i);
    	
    }

    /** pluck the guitar string by replacing the buffer with white noise */
    public void pluck() {
    	double min = -0.5;
    	double max = 0.5;
    	
         for(int i = 0; i < num; i++)
         {
        	 buffer.dequeue();
        	 double range = (Math.random() * (max - min+1)) + min;
        	 System.out.println(range);
        	 buffer.enqueue(range);
         }
    }

    /** advance the simulation one time step */
    public void tic() {
        count++;
        
        double first = buffer.dequeue();
        double second = buffer.peek();
        double avg = (first + second) / 2;
        
        buffer.enqueue(avg * ENERGY_DECAY_FACTOR);
    }

    /** return the current sample */
    public double sample() {
        // YOUR CODE HERE

        return buffer.peek();
    }

    /** return number of times tic was called */
    public int time() {

        return count; 
    }

    public static void main(String[] args) {
        int N = 25;
        double[] samples = { .2, .4, .5, .3, -.2, .4, .3, .0, -.1, -.3 };  
        GuitarString testString = new GuitarString(samples);
        for (int i = 0; i < N; i++) {
            int t = testString.time();
            double sample = testString.sample();
            System.out.printf("%6d %8.4f\n", t, sample);
            testString.tic();
        }
        /*
         * Your program should produce the following output when the main() 
         * method runs (DON'T WORRY ABOUT VERY MINOR DIFFERENCES, E.G. OFF BY 0.001):
                0   0.2000 y
			    1   0.4000 y
			    2   0.5000 y
			    3   0.3000 y
			    4  -0.2000 y
			    5   0.4000 y
			    6   0.3000
			    7   0.0000
			    8  -0.1000
			    9  -0.3000
			   10   0.2988
			   11   0.4482
			   12   0.3984
			   13   0.0498
			   14   0.0996
			   15   0.3486
			   16   0.1494
			   17  -0.0498
			   18  -0.1992
			   19  -0.0006
			   20   0.3720
			   21   0.4216
			   22   0.2232
			   23   0.0744
			   24   0.2232
         */
    }
}
