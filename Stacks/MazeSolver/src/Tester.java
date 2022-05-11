import java.io.IOException;
import java.util.Stack;

public class Tester
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Square s = new Square(0, 0, 1); //1 is wall
		System.out.println(s);
		s.setType(0); //empty space
		System.out.println(s);
		s.setStatus('o');
		System.out.println(s.getStatus());
		
		System.out.println("\nTesting Maze class \n");
		
		Maze test = new Maze();
		test.loadMaze("maze-7");
		System.out.println("\nMaze:\n" + test);
		System.out.println(test.getNeighbors(test.getStart()));
		test.reset();
		System.out.println("\nAfter reset: \n" + test);
		System.out.println("begin square location: " + test.getStart() + "[" + test.getStart().getRow() + " , " + test.getStart().getCol() + "]");
		System.out.println("end square location: " + test.getExit()+ "[" + test.getExit().getRow() + " , " + test.getExit().getCol() + "]");

		
		MyStack mine = new MyStack();
		Stack<Square> javas = new Stack<>();
	}

}
