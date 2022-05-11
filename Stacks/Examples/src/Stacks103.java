import java.util.Stack;

public class Stacks103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> myStack = new Stack<String>();
		myStack.push("Arsal");
		myStack.push("Arjun");
		myStack.push("Ricky");
		myStack.push("Randy");
		myStack.push("Kevin");
		
		System.out.println("Stack:: " + myStack + "\n");
		
		//peek() returns the top object of the stack but does 
		//not remove it from the stack
		
		System.out.println("P E E K I N G");
		System.out.println(myStack.peek());
		
		System.out.println("\n" + myStack + "\n");
		
		//isEmpty() returns true if there is nothing inside of the stack
		System.out.println("Popping until (isEmpty == true)");
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop() + "\t\tEmpty Stack: " + myStack.isEmpty());
		}
		
		System.out.println("\n" + myStack + "\n");
	}

}
