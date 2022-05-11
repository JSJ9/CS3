import java.util.ArrayList;

public class Disk implements Comparable<Disk>
{
	private static final int CAPACITY = 1000000;
	private int diskNumber; //first disk is 0 keep track
	private ArrayList<Integer> listOfFiles;
	private int diskSpaceLeft;
	
	public Disk()
	{
		diskNumber = 0;
		listOfFiles = new ArrayList<Integer>();
		diskSpaceLeft = CAPACITY;
	}
	
	public void add(int i)
	{
		diskSpaceLeft -= i;
		diskNumber++;
		listOfFiles.add(i);
	}
	
	public int getDiskNumber()
	{
		return diskNumber;
	}
	
	public int spaceLeft()
	{
		return diskSpaceLeft;
	}
	
	@Override
	public int compareTo(Disk arg0) {
		if()
	}
	
	@Override
	public String toString()
	{
		//implement comparable here
		String out = "";
		
		out += "Total size = " + "\n";
		
		out += "Disks req'd = " + "\n";
		
	}
	
	
	
}
