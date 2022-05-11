import static java.lang.System.*;
import java.util.*;

public class Exceptions104 {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(in);
		out.print("Enter an integer: ");
		int num = scan.nextInt();
		int answer = 0;
		
		try 
		{
			if(num == 0)
				throw new Exception("Dividing by zero again i see, dumb whore");
			else
				answer = 42/num;
		}
		catch(NullPointerException e)
		{
			out.println(e + "\nNull Pointer Exception");
		}
		catch(ClassCastException e)
		{
			out.println(e + "\nClass Cast Exception biotch");
		}
		catch(Exception e)
		{
			out.println(e + "\nGeneral Stupid Exception (you)");
		}
		finally { //code inside is guaranteed to run whether or not an exception is caught. ALWAYS RUN                                                                                                                                        
			out.println("this always happens");
			scan.close();
		}
		
		out.println("the answer is " + answer);
	}
}
