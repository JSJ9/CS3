import java.util.Scanner;

public class IteratorReplacerRunner
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String answer;
		do
		{
		System.out.println("Enter in sample data: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("Enter character you would like to remove: ");
		String removeThis = scan.next();
		System.out.println("Enter the character you would like to replace the char with: ");
		String replace = scan.next();
		
		IteratorReplacer it = new IteratorReplacer(input, removeThis, replace);
		it.setEmAll(input, removeThis, replace);
		it.replace();
		
		System.out.println(it.toString());
		

		System.out.println("Enter another sample? [y/n] ");
		answer = scan.next();
		
		}while(answer.equalsIgnoreCase("y"));

	}

}