import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WorstFitDecreasing
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("input20.txt"));
		double total = 0;
		PriorityQueue<Disk> disks = new PriorityQueue<Disk>();
		ArrayList<Integer> order = new ArrayList<Integer>();
		
		//inserts all files into an array and sorts it
		while(scan.hasNextLine())
		{
			int disk = Integer.parseInt(scan.nextLine());
			order.add(disk);
		}
		
		Collections.sort(order);
		
		//we do the same process as done in worst fit
		int diskNum = 0;
		disks.add(new Disk(diskNum++));
		
		for( int i = order.size()-1; i > -1; i--)
		{
			int file = order.get(i);
			Disk temp = disks.poll();
			
			if(temp.canAdd(file))
			{
				temp.add(file);
				disks.add(temp);
			}
			else
			{
				disks.add(temp);
				Disk d = new Disk(diskNum++);
				d.add(file);
				disks.add(d);
			}
		}
		
		
		for(Disk d : disks)
		{
			total += d.getSpaceUsed();
		}
		
		System.out.println("Total size  = " + total / 1000000 + " GB");
		System.out.println("disks req'd = " + disks.size() + "\n");
		System.out.println("\t# Avail");
		while(!disks.isEmpty())
			System.out.println("\t" + disks.poll() + "\n");
	}
}
