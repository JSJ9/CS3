import java.awt.Color;
import java.util.Stack;

public class Stacks102 {
	public static void main(String[] args) {
		//Java 5+ prefers, but does not require, that you specify 
		// the type of things on the stack just like you do w/ AL
		
		Stack<String> myStack = new Stack<String>();
		//myStack.push(Color.RED); // error. not aplicable cause color is not object
		myStack.push("Arsal");
		myStack.push("Arjun");
		myStack.push("Ricky");
		myStack.push("Randy");
		myStack.push("Kevin");
		
		System.out.println("\nPrinting stack with loop :: ");
		for(int i = 0; i < myStack.size(); i++)
		{
			System.out.println(i + ". " + myStack.get(i));
		}
		
		System.out.println();
		
		System.out.println("Printing stack with toString() ::");
		System.out.println(myStack);
		
		System.out.println("\n-Popping 1 element from top of stack-");
		myStack.pop();
		
		System.out.println("\nPrinting stack with loop :: ");
		for(int i = 0; i < myStack.size(); i++)
		{
			System.out.println(i + ". " + myStack.get(i));
		}
		System.out.println();
		
		System.out.println("Popping " + myStack.pop() + " from top of the stack");
		System.out.println("Popping " + myStack.pop() + " from top of the stack");

		System.out.println("\nPrinting stack with loop :: ");
		for(int i = 0; i < myStack.size(); i++)
		{
			System.out.println(i + ". " + myStack.get(i));
		}
		System.out.println();
	}
}
