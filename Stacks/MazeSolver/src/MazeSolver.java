
public abstract class MazeSolver {
	
	private Maze maze;
	private boolean solved;
	private boolean solvable;
	
	MazeSolver(Maze maze)
	{
		this.maze = maze;
		solved = false;
		solvable = true;
	}
	
	/**
	 * Create an empty worklist
	 */
	public abstract void makeEmpty();
	
	/**
	 * returns of the worklist is empty
	 * @return true if empty
	 */
	public abstract boolean isEmpty();
	
	/**
	 * Adds param s to the worklist
	 * @param s	- Square value
	 */
	public abstract void add(Square s);
	
	/**
	 * Returns the next item in the worklist
	 * @return	-	next item
	 */
	public abstract Square next();
	
	public boolean isSolved()
	{
		if(!solvable)
			return true;
		else 
			return solved; 
			
	}
	
	public void step()
	{
		Square curr = next();
		
		if(curr != null) //che3cks if not null
		{
			if(curr.getStatus() != Square.START) //checks if the status is not the start value, cause we dont wanna change that
			{
				curr.setStatus(Square.EXPLORED); //sets the status to currently exploring
			}
			// check to see if the curr square is an exit
			// return but change solved to true
			// return;
			//else
			//getListofNeighbors() calling method and store into a list
			//call add(s)
			//dont add squares that are a wall, add ones that have not been explored
			//when added you change it to working
		}
		//else, if it is null, the solvable is false;
		
	}
	
	public String getPath()
	{
		
	}
}
