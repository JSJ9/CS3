
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class SyntaxChecker
{
	private String exp; // string expression
	private Stack<Character> symbols; //stack of characters names symbols

	/**
	 * instantiates exp and symbols
	 */
	public SyntaxChecker()
	{
		exp = "";
		symbols = new Stack<Character>();
	}

	/**
	 * Instantiates exp with the value of s and sets the symbols stack to the
	 * symbols
	 * 
	 * @param s
	 */
	public SyntaxChecker(String s)
	{
		this();
		exp = s;
		setExpression(s);
	}

	/**
	 * populates the symbols stack with brace values from string s
	 * 
	 * @param s - string that will populate the stack
	 */
	public void setExpression(String s)
	{
		exp = s;
	}

	/**
	 * Checks the expression by going through he stack and if it is a beginning brace, it is pushed onto the stack. If not, it checks if the stack is 
	 * already empty. If not, then it pops out the top most value and checks if the index of the first beginning strin gis the same for the second.
	 *  If so, it is equal.
	 * @return
	 */
	public boolean checkExpression()
	{

		String allBegin = "({[<";
		String allEnd = ")}]>";
		String[] ray = exp.split("");


		for (int i = 0; i < ray.length; i++)
		{
			String s = ray[i];
			if(allBegin.contains(s))
				symbols.push(s.charAt(0));
			else if (allEnd.contains(s))
			{
				if (symbols.isEmpty())
					return false;
				else
				{
						char dw = symbols.pop();

						if(allBegin.indexOf(dw) == allEnd.indexOf(s))
							continue;
				}
			}
		}
		return symbols.isEmpty();

	}

	/**
	 * Prints out exp and if it is correct or not
	 */
	@Override
	public String toString()
	{
		if (checkExpression())
			return exp + " is correct";
		else
			return exp + " is incorrect";
	}
}