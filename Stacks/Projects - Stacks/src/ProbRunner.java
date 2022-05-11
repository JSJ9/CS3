import java.util.Arrays;
import java.util.Stack;

public class ProbRunner {
	
	public static void main(String[] args) {
		StackProbs sp = new StackProbs();
		
		System.out.println("Double up method");
		System.out.println("-------------------------------");
		int[] test1 = {1, 3, 5, 0, -1};
		System.out.print(Arrays.toString(test1) + " >>> ");
		Stack<Integer> stack1 = sp.makeStack(test1);
		System.out.print(sp.doubleUp(stack1));
		
		System.out.println("\n\n\nPositive and Negative method");
		System.out.println("-------------------------------");
		int[] test2 = {2, 9, -4, 3, -1, 0, -6};
		System.out.print(Arrays.toString(test2) + " >>> ");
		Stack<Integer> stack2 = sp.makeStack(test2);
		System.out.print(sp.posAndNeg(stack2));
		
		System.out.println("\n\n\nShift by n method");
		System.out.println("-------------------------------");
		int[] test3 = {7, 23, -7, 0, 22, -8, 4, 5};
		System.out.print(Arrays.toString(test3) + " >>> ");
		Stack<Integer> stack3 = sp.makeStack(test3);
		System.out.print(sp.shiftByN(stack3, 3));
		
		System.out.println("\n\n\nReverse Vowels method");
		System.out.println("-------------------------------");
		System.out.print(" \"hello how are you\" >>> ");
		System.out.print(sp.reverseVowels("hello how are you"));

	}


}