import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Melody 
{
	private Queue<Note> notes;
	
	public Melody(Queue<Note> song)
	{
		notes = song;
	}
	
	/**
	 * Goes through the queue of songs and gets the duration of each note and adds it to the 
	 * total, which is the total amount of seconds the songs takes up
	 * @return	- a double of the sum of the duration of all of the notes
	 */
	public double getTotalDuration()
	{
		double length = 0;
		
		Queue<Note> temp = new LinkedList<Note>();
		temp.addAll(notes);
		
		while(!temp.isEmpty())
		{
			Note t = temp.poll();
			
			if(t.isRepeat()) //<3
			{
				while(!temp.isEmpty())
				{
					
					Note tempVal = temp.poll();
					
					if(tempVal.isRepeat())
					{
						System.out.println(tempVal.getDuration() * 2);
						length += tempVal.getDuration() * 2;
						break;
					}
					else
					{
						System.out.println(tempVal.getDuration());
						length += tempVal.getDuration() * 2;
					}
				}
			}
			
			System.out.println(t.getDuration());
			length += t.getDuration();
			
			
		}
		
		return length;
	}
	
	/**
	 * This method takes the tempo and divides the current duration of each note to
	 * get the new duration and sets it to that duration.
	 * @param tempo	- the value of change of the note duration
	 */
	public void changeTempo(double tempo)
	{
		
		Queue<Note> tempQ = new LinkedList<Note>();
			
		while(!notes.isEmpty())
		{
			Note tempVal = notes.poll();
			tempVal.setDuration(tempVal.getDuration() / tempo);
			tempQ.offer(tempVal);
		}
		
		notes = tempQ;
	}
	
	/**
	 * Puts the values in the queue onto a stack, and then pops the stack onto the queue
	 * to reverse it
	 */
	public void reverse()
	{
		Stack<Note> temp = new Stack<Note>();
		
		while(!notes.isEmpty())
		{
			temp.push(notes.poll());
		}
		
		
		while(!temp.isEmpty())
		{
			notes.offer(temp.pop());
		}
	}
	
	/**
	 * @return	- returns the instance queue notes 
	 */
	public Queue<Note> getNotes()
	{
		return notes;
	}
	
	/**
	 * Adds the notes of the other melody at the end of the notes
	 * @param other
	 */
	public void append(Melody other)
	{
		Queue<Note> newVals = other.getNotes();
		
		while(!newVals.isEmpty())
		{
			this.notes.offer(newVals.poll());
		}
	}
	
	public void play()
	{
		Queue<Note> temp = new LinkedList<Note>();
		Queue<Note> repeat = new LinkedList<Note>();
		
		temp.addAll(notes);
		System.out.println("values of temp: " + temp);
		
		while(!temp.isEmpty())
		{
			Note currNote = temp.poll();
			
			System.out.println("current note: " + currNote);
			System.out.println("Is it repeating?: " + currNote.isRepeat());
			if(currNote.isRepeat())
			{
				System.out.println("Inside of the if statement" );
				repeat.offer(currNote);
				
				while(!temp.isEmpty())
				{
					Note repeatVal = temp.poll();
					if(repeatVal.isRepeat())
					{
						repeat.offer(repeatVal);
						repeat.addAll(repeat);
						break;
					}
					else
						repeat.offer(repeatVal);
				}
				
				System.out.println("repeat: " + repeat);
				
				while(!repeat.isEmpty())
				{
					Note currVall = repeat.poll();
					currVall.play();
				}
				
			}
			
			currNote.play();
		}
	}
	
	@Override
	public String toString()
	{
		String out = "";
		System.out.println("out: " + out);
		
		for(Note i : notes)
		{
			out += i.toString() + "\n";
		}
		
		return out;
	}
	
}