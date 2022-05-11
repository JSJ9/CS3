import java.util.Stack;

public class PostFix
{
	private Stack<Double> stack; //the stack we are going through that will contain the characters from expression
	private String expression; //expression being looked at

	/**
	 * initializes stack and expression string
	 */
	public PostFix()
	{
		stack = new Stack<Double>();
		expression = "";
	}

	/**
	 * Initializes expression and stack, but sets expression to the param exp
	 * @param exp	- string being used for the expression
	 */
	public PostFix(String exp)
	{
		this();
		expression = exp;
	}

	/**
	 * this sets the expression to param exp and sets the stack equal to the 
	 * characters in exp.
	 * @param exp 	- string being used for the expression and stack
	 */
	public void setExpression(String exp)
	{
		expression = exp;
	}

	/**
	 * Calculates the value of doing an operation between two numbers
	 * @param one	- the first double value
	 * @param two	- the second double value
	 * @param op	- the operation
	 * @return		- the result of doing the operation between one and two
	 */
	public double calc(double one, double two, char op)
	{
		if(op == '+')
			return two + one;
		else if(op == '-')
			return two - one;
		else if(op == '*')
			return two * one;
		else if(op == '/')
			return two / one;
		else
			return 0.0;
	}

	/**
	 * goes through the expression and checks if it is an integer or an operation. If it is a number, it is pushed onto the stack.
	 * If it is an operation, we pop out the two numbers and call the method calc to find the value. We then push the result back into the 
	 * stack.
	 */
	public void solve()
	{
		for(int i = 0; i < expression.length(); i++)
		{
			if(expression.charAt(i) >= 48 && expression.charAt(i) <= 57)
			{
				stack.push(Double.parseDouble(expression.substring(i, i+1)));
			}
			else if(expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' ||expression.charAt(i) == '/')
			{
//				System.out.println("Stack before: " + stack);
				double one = stack.pop();
//				System.out.println("one: " + one);
				double two = stack.pop();
//				System.out.println("two: " + two);
				char oprtr = expression.charAt(i);
				
//				System.out.println("stack middle: " + stack);
				double result = calc(one, two, oprtr);
				stack.push(result);
//				System.out.println("Stack after: " + stack);
			}
		}
	}

	/**
	 * Prints out the expression and the result
	 */
	@Override
	public String toString()
	{
		return expression + " = " + stack.pop();
	}
}