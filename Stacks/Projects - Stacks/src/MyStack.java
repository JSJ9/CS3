import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
	
//	 private static final Exception EmptyStackException = null;
	 private Integer[] stack; //the stack we are using
	 private int size; //size of the stack
	 
	 /**
	  * Instantiates stack and size to default values. 
	  * Stack will be of size 0
	  * size will also be of size 0
	  */
	 public MyStack()
	 {
		 size = 0;
		 stack = new Integer[0];
	 }
	 
	 /**
	  * Sets the stacks length to the initial capacity
	  * @param initCap
	  */
	 public MyStack(int initCap)
	 {
		 size = initCap;
		 stack = new Integer[initCap];
		 
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
	 public Integer peek()
	 {
		 try
		 {
			 return stack[size-1];
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
	  * Then we store the values in variables and return the output integer.
	  * @return
	  */
	 public Integer pop()
	 {
		 
		 if(size != 0)
		 {
			 Integer[] temp = new Integer[size-1];
//			 System.out.println("\ntemp: " + Arrays.toString(temp));
//			 System.out.println("temp length: " + temp.length);
			 
			 for(int i = 0; i < size-1; i++)
				 {
					 temp[i] = stack[i];
				 }
				 
			 	Integer output = stack[size-1];
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
	 public void push(Integer item)
	 {
		 	int currSize = size; //0
			Integer[] temp = new Integer[size+1]; //1
			
			if(size == 0)
			{
				Integer[] tempp = {item};
				this.stack = tempp;
			}
				
			for(int i = 0; i < size; i++)
			{
				temp[i] = stack[i]; //there is nothing in stack so therefore null
			}
			
			temp[temp.length-1] = item;
			
			this.stack = temp;
			
			if(size == currSize)
			{
				this.size += 1;
			}
	 }
	 
	 /**
	  * Double the size of the stack. Keeps original values, adds values
	  * after original.
	  */
	 private void doubleCapacity()
	 {
		 Integer[] temp = new Integer[size*2];
		 
		 for(int i = 0; i < size; i++)
		 {
			 temp[i] = stack[i];
		 }
		 
		 this.stack = temp;
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