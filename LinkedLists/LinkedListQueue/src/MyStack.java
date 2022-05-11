import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
	
//	 private static final Exception EmptyStackException = null;
	 private Square[] stack; //the stack we are using
	 private int size; //logical size of the stack
	 
	 /**
	  * Instantiates stack and size to default values. 
	  * Stack will be of size 0
	  * size will also be of size 0
	  */
	 public MyStack()
	 {
		 size = 0;
		 stack = new Square[0];
	 }
	 
	 /**
	  * Sets the stacks length to the initial capacity
	  * @param initCap
	  */
	 public MyStack(int initCap)
	 {
		 this();
		 stack = new Square[initCap];
		 
	 }
	 
	 /**
	  * Checks the size of the Stack.
	  * @return true if the stack is empty or false it isn't
	  */
	 public boolean isEmpty()
	 {
		 return size == 0;
	 }
	 
	 /**
	  * Returns the value at the end of the array.
	  * @return the value at the end of the array or throws an exception if 
	  * the size is 0.
	  */
	 public Square peek()
	 {
		 try
		 {
			 return stack[stack.length-1];
		 }
		 catch(EmptyStackException e)
		 {
			 System.out.println(e.getMessage());
			 return null;
		 }
	 }
	 
	 /**
	  * If the size is not equal to 0, then it will make a temporary array
	  * equal to the size of the original array minus one. Then it will take 
	  * in all of the original values except the one at the end of the array.
	  * Then we store the values in variables and return the output Square.
	  * @return
	  */
	 public Square pop()
	 {
		 
		 if(size > 0)
		 {
			 Square[] temp = new Square[stack.length-1];
//			 System.out.println("\ntemp: " + Arrays.toString(temp));
//			 System.out.println("temp length: " + temp.length);
			 
			 for(int i = 0; i < stack.length-1; i++)
				 {
					 temp[i] = stack[i];
				 }
				 
			 	Square output = stack[size-1];
				 this.stack = temp;
				 this.size = size-1;
//				 System.out.println("new stack: " + Arrays.toString(stack));
				 return output;
		 }
		 throw new EmptyStackException();
	 }
	 
	 /**
	  * if the size is 0 then the temp value will equal the array. if not, 
	  * it will traverse the array and set the original values the same as 
	  * the values in the new one. We then set the last value as the item.
	  * If the size is equal to the currentSize, we add one more to the size.
	  * @param item
	  */
	 public void push(Square item)
	 { 
		 size++;
		 if(size > stack.length)
			 doubleCapacity();
		 
		 stack[size-1] = item;
		 //kiss dumbass
	 }
	 
	 /**
	  * Double the size of the stack. Keeps original values, adds values
	  * after original.
	  */
	 private void doubleCapacity()
	 {
		 
		 //physical size - size of the array capacity
		 //logical size - actual size/storage being used
		 if(stack.length == 0)
		 {
			 Square[] tempRay = new Square[1];
			 this.stack = tempRay;
		 }
		 else
		 {
			 Square[] temp = new Square[size*2];
			 for(int i = 0; i < stack.length; i++)
			 {
				 temp[i] = stack[i];
			 }
			 
			 this.stack = temp;
		 }
	 }
	 
	 /**
	  * prints out the stack
	  */
	 @Override
	 public String toString()
	 {
		 return Arrays.toString(stack);
	 }
}