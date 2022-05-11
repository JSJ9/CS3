
public class MazeSolverQueue extends MazeSolver
{
	private MyQueue<Square> worklist;
	
	MazeSolverQueue(Maze maze)
	{
		super(maze);
		worklist = new MyQueue<Square>();
		add(maze.getStart());
	}

	@Override
	public void makeEmpty()
	{
		worklist = new MyQueue<Square>();
		
	}

	@Override
	public void add(Square s)
	{
		worklist.offer(s);
		
	}

	@Override
	public Square next()
	{
		return (Square) worklist.poll();
	}

}
