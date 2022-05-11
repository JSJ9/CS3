import java.util.Stack;

public class MazeSolverStack extends MazeSolver
{
	private MyStack stack;
	
	/**
	 * Initializes stack to a new stack of MyStack values. It also adds the the start of the maze onto the stack. 
	 * Calls the constructor of the MazeSolver class.
	 * @param maze	- maze that is initialized in the MazeSolver class.
	 */
	MazeSolverStack(Maze maze)
	{
		super(maze);
		stack = new MyStack();
		add(maze.getStart());
	}
	
	/**
	 * current Square value is added onto the worklist
	 */
	@Override
	public void add(Square s)
	{
		stack.push(s);
	}

	/**
	 * sets the stack to a new stack of MyStack values.
	 */
	@Override
	public void makeEmpty()
	{
		stack = new MyStack();
		
	}


	/**
	 * Goes to the next value in the stack. If there are not values left, null is returned
	 */
	@Override
	public Square next()
	{
		if(!stack.isEmpty()) //prevent empty stack exception
			return stack.pop();
		else
			return null;
	}

}
