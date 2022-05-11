
public class Square
{
	//different types of square values
	public static final int SPACE = 0; // empty space
	public static final int WALL  = 1; // wall value
	public static final int START = 2; // starting point
	public static final int EXIT  = 3; // exit
	
	//statuses of a square - for GUI
	public static final char WORKING  = 'o';
	public static final char EXPLORED = '.';
	public static final char ON_PATH  = 'x';
	public static final char UNKNOWN  = '_';
	
	private int row;  //x value of location on maze
	private int col;  //y value of location on maze
	private int type; //type of square this is: space, wall, start, exit.
	private char status; //status of the square: work, explored, on path.
	
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
	
	public void setStatus(char s)
	{
		this.status = s;
	}
	
	public String toString()
	{
		if(this.type == SPACE)                                                                
			return "_";
		else if(this.type == WALL)
			return "#";
		else if(this.type == START)
			return "S";
		else
			return "E";
	}
	
}
