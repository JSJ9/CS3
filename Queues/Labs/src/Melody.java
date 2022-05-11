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
	 * 
	 * @return
	 */
	public double getTotalDuration()
	{
		double length = 0;
		
		for(int i = 0; i < notes.size(); i++)
		{
			length += notes.peek().getDuration();
		}
		
		return length;
	}
	
	public String toString()
	{
		String out = "";
		
		for(int i = 0; i < notes.size(); i++)
		{
			out += notes.peek().toString() + "\n";
		}
		
		return out;
	}
	
	public void changeTempo(double tempo)
	{
		for(int i = 0; i < notes.size(); i++)
		{
			Note temp = notes.peek();
			
			temp.setDuration(temp.getDuration() * temp.getDuration());
		}
	}
	
	public void reverse()
	{
//		Stack<Note> temp = new Stack<Note>();
//		
//		for(int i = 0; i < notes.size(); i++)
//		{
//			temp.push(notes.poll());
//		}
//		
//		notes.addAll(temp);
	}
	
	public Queue<Note> getNotes()
	{
		Queue<Note> notesPlayed = new LinkedList<Note>();
		
		return notesPlayed;
	}
	
	public void append(Melody other)
	{
		
	}
	
	public void play()
	{
		
	}
}
