import java.awt.Color;
import java.util.Stack;

public class Stacks101 {

	public static void main(String[] args) {
		// Here's the old way of using stacks (which still works, but you may get a warning message)
		
		Stack myStack = new Stack();
		
		//push() adds an item to that stack
		System.out.println("*P U S H I N G*");
		
		System.out.println("Color.PINK");
		myStack.push(Color.PINK);
		
		System.out.println("abcdefghijklmn");
		myStack.push("abcdefghijklmn");
		
		System.out.println("409");
		myStack.push(409); //autoboxing - automatically wraps it to an integer class
		
		System.out.println("\nPrinting stack with toString");
		System.out.println(myStack + "\n");

		//pop() removes an item from the stack
		System.out.println("\n" + "*P O P P I N G*");
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
//		Color r = myStack.pop();
		Color r = (Color)myStack.pop();
		System.out.println(r);
		
	}

}
