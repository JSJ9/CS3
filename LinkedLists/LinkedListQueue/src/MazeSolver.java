import java.util.List;

public abstract class MazeSolver {
	
	private Maze maze; // maze being run through
	private boolean solved; //is the maze completed
	private boolean solvable; //is it able to be solved
	
	/**
	 * Initializes the maze and sets solved to false and solvable to true. Set to their default values
	 * @param maze	- the maze that will be going into the maze in MazeSolver
	 */
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
//	public abstract boolean isEmpty();
	
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
	
	/**
	 * Determines whether the maze is solved or not based on the values of solvable and solved.
	 * @return	- true if the maze solver is complete and the runner has not found an exit, else, returns the value of solved (if the maze solver has found a solution or not)
	 */
	public boolean isSolved()
	{
		if(!solvable)
			return true;
		else 
			return solved; 
			
	}
	
	/**
	 * Takes in the next value from next(), then checks if it is not null. The value then passes through boolean statements and based on 
	 * whether it is true or false, it current square location is set to explored, the maze solver is complete, or the neighbors are taken in and 
	 * are added onto the worklist.
	 */
	public void step()
	{
		Square curr = next();
		
		if(curr != null) //che3cks if not null
		{
			if(curr.getType() != Square.START) //checks if the status is not the start value, cause we dont wanna change that
			{
				curr.setStatus(Square.EXPLORED); //sets the status to currently exploring
			}
			
			if(curr.getType() == Square.EXIT)
			{
				solved = true;
				return;
			}
			else
			{
				List<Square> temp = maze.getNeighbors(curr); //list of neighbors
				
				for(Square i : temp)
				{
					if(i.getType() != Square.WALL && i.getStatus() != Square.EXPLORED) //checks if not a wall or not explored already
					{
						add(i); //added to worklist
						i.setStatus(Square.WORKING); //changed to working status 'o'
						
					}
				}
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
		else
			solvable = false;
		//else, if it is null, the solvable is false;
		
	}
	
	/**
	 * Returns a string on the status of solving the maze. If the maze is currently being run through and it has not found the exit yet, then 
	 * the program outputs a certain string literal. If the runner has found the exit and it is solved, then a different string literal is printed out.
	 * If neither of these conditions are met, then there is no solution to the maze.
	 * @return	- based on whatever condition solved and solvable meet, "Not solved yet," "solved!" or "unsolvable" will be returned.
	 */
	public String getPath()
	{
		if(solvable && !solved) 
			return "Not solved yet";
		else if(solved && isSolved())
		{
			return "solved!";
			Square current = this.maze.getExit();
			
		}
		else
			return "unsolvable";
	}
	
	/**
	 * While the maze is still not solved, it will call the method step until it is solved.
	 */
	public void solve()
	{
		while(!isSolved())
		{
			step();
		}
	}
}