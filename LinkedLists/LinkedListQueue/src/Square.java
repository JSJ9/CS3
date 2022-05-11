
public class Square
{
	//different types of square values
	public static final int SPACE = 0; // empty space
	public static final int WALL  = 1; // wall value
	public static final int START = 2; // starting point
	public static final int EXIT  = 3; // exit
	
	//statuses of a square - for GUI
	public static final char WORKING  = 'o'; //value for the working status
	public static final char EXPLORED = '.'; //value for the already explored status
	public static final char ON_PATH  = 'x'; // bonus
	public static final char UNKNOWN  = '_'; //value for the unknown status, there is no assigned status yet.
	
	private int row;  //x value of location on maze
	private int col;  //y value of location on maze
	private int type; //type of square this is: space, wall, start, exit.
	private char status; //status of the square: work, explored, on path.
	private Square prev;
	
	/**
	 * instantiates the values for row, column, and the type
	 * @param row	- row value
	 * @param col	- column value
	 * @param type	- type of square value
	 */
	public Square(int row, int col, int type)
	{
		this.row = row;
		this.col = col;
		this.type = type;
		this.setPrev(null);
	}
	
	/**
	 * checks too see if the values of object and values of the current Square
	 * are equal.
	 */
	public boolean equals(Object obj)
	{
		Square other = (Square) obj; //class cast
		return other.getRow() == this.row && other.getCol() == this.col;
	}
	
	/**
	 * @return row value
	 */
	public int getRow()
	{
		return row;
	}
	
	/**
	 * Sets the row to the parameter i
	 * @param i	- sets the row to the parameter 
	 */
	public void setRow(int i)
	{
		this.row = i;
	}
	
	/**
	 * @return column value
	 */
	public int getCol()
	{
		return col;
	}
	
	/**
	 * Sets the new column
	 * @param i	 - sets the column value to parameter i
	 */
	public void setCol(int i)
	{
		this.col = i;
	}
	
	/**
	 * @return type value
	 */
	public int getType()
	{
		return type;
	}
	
	/**
	 * sets the new type to parameter t
	 * @param t	- the new type
	 */
	public void setType(int t)
	{
		this.type = t;
	}
	
	/**
	 * @return status value
	 */
	public char getStatus()
	{
		return status;
	}
	
	/**
	 * sets the status to char s
	 * @param s	 - the new status
	 */
	public void setStatus(char s)
	{
		this.status = s;
	}
	
	/**
	 * Prints out the type and status of different Square values in the maze. If it is a space, we check what status it is equal to 
	 * and set the string to that status. Else, we just set the string to the type.
	 */
	public String toString()
	{
		if(this.type == SPACE) //<3
		{
			if(this.status == WORKING)
				return "o";
			else if(this.status == EXPLORED)
				return ".";
			else if(this.status == ON_PATH)
				return "x";
			else
				return "_";
		}
		else if(this.type == WALL)
			return "#";
		else if(this.type == START)
			return "S";
		else
			return "E";
	}

	public Square getPrev()
	{
		return prev;
	}

	public void setPrev(Square prev)
	{
		this.prev = prev;
	}
	
}