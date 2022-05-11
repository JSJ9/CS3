import java.util.Scanner;

public class IteratorRemoverRunner
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
		
		IteratorRemover it = new IteratorRemover(input, removeThis);
		it.setTest(input, removeThis);
		it.remove();
		
		System.out.println(it.toString());
		

		System.out.println("Enter another sample? [y/n] ");
		answer = scan.next();
		
		}while(answer.equalsIgnoreCase("y"));

	}

}