import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Maze {

	private Square[][] twoRay;
	private Square[][] oldTwoRay;
	private Square exitSquare;
	private Square startSquare;

	/**
	 * initiliazes twoRay, exitSquare, and beginSquare
	 */
	public Maze() {
		twoRay = new Square[1][1];
	}

	/**
	 * Sees if the file the maze wants to load exists. If it does, it creates the
	 * maze
	 * 
	 * @param fileName - the file we want to load into the maze
	 * @return - returns true if the file does exist, false if it doesn't
	 * @throws IOException - throwing for the sake of reading in a file.
	 */
	public boolean loadMaze(String fileName) throws IOException {
		try {
			Scanner scan = new Scanner(new File(fileName));

			int row = scan.nextInt();
			System.out.println(row);
			int col = scan.nextInt();
			System.out.println(col);
			twoRay = new Square[row][col];
			oldTwoRay = new Square[row][col];

			for (int x = 0; x < row; x++) {
				for (int y = 0; y < col; y++) {
					int temp = scan.nextInt();

					twoRay[x][y] = new Square(x, y, temp);
					oldTwoRay[x][y] = new Square(x, y, temp);

					if (twoRay[x][y].getType() == 2) {
						startSquare = twoRay[x][y];
					} else if (twoRay[x][y].getType() == 3) {
						exitSquare = twoRay[x][y];
					}
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("ERROR - File not found - ERROR");
			return false;
		}

		return true;

	}

	/**
	 * this method goes through the 2D Array and returns the neighbors.
	 * 
	 * @param s
	 * @return
	 */
	public List<Square> getNeighbors(Square s) {
		
		//NO NEED FOR DIAGONALS
		//A BUNCH OF IF STATEMENTS
		System.out.println("getNeighbors is called");
		ArrayList<Square> list = new ArrayList<Square>();
//		System.out.println("list: " + list);
		int col = s.getCol();
//		System.out.println("col : " + col);
		int row = s.getRow();
//		System.out.println("row: " + row);
		
//		
//
//		if(row == 0 && col == 0)
//		{
//			list.add(twoRay[row][col+1]);
//			list.add(twoRay[row+1][col]);
//		}
//		else if(col == 0 && row == twoRay.length-1)
//		{
//			list.add(twoRay[row][col+1]);
//			list.add(twoRay[row-1][col]);
//		}
//		else if(row > 0 && col > 0 && row == twoRay.length)
//		{
//			list.add(twoRay[row-1][col]);
//			list.add(twoRay[row][col-1]);
//			list.add(twoRay[row][col+1]);
//			list.add(twoRay[row+1][col]);
//		}
//		else
//		{
//			list.add(twoRay[row-1][col]);
//			list.add(twoRay[row][col-1]);
//			list.add(twoRay[row][col+1]);
//			list.add(twoRay[row+1][col]);
//		}
		
		if(row > 0)
		{
			list.add(twoRay[row-1][col]);
		}
		if(col > 0)
		{
			list.add(twoRay[row][col-1]);
		}
		if(col < twoRay[row].length-1)
		{
			list.add(twoRay[row][col+1]);
		}
		if(row < twoRay.length-1)
			list.add(twoRay[row+1][col]);
		
		
		
		
		
		
		
		
		
		//You are not a dissapointment, don't listen to that. You're amazing and I'm sorry you're dealing with this
		//but I'm here for you, you're not alone...
		
		
		
		
		
		
		//omfg please end me why tf did i do this to myself wow okay this is great why tf did i think
		//it wouuld be okay to leave it like this
		//omg i cannot deal with some people love how im ranting to a java ide. I really hope I go to 
		//the hackathon. you could've done better. u r a dissapointment LOL
		
		return list;
		
		
		
		
//
//		System.out.println("list: " + list);
//
//		return list;
	}

	/**
	 * checks if the values x and y in the 2d array are within the array.
	 * 
	 * @param x - the x coord or the row of the array
	 * @param y - the y coord or the column of the array
	 * @return - true if the x and y value of the current grid position is less than
	 *         the size of the array
	 */
	private boolean withinBounds(int x, int y) {
		return x >= 0 && y >= 0 && x <= twoRay.length && y < twoRay.length;
	}

	/**
	 * Finds what square is the start value.
	 * 
	 * @return
	 */
	public Square getStart() {
		for (int x = 0; x < twoRay.length; x++) {
			for (int y = 0; y < twoRay[x].length; y++) {
				if (twoRay[x][y].getType() == 2)
					return twoRay[x][y];
			}
		}

		return null;
	}

	/**
	 * Returns the start and end location of the end location squares.
	 * 
	 * @return
	 */
	public Square getExit() {
		for (int x = 0; x < twoRay.length; x++) {
			for (int y = 0; y < twoRay[x].length; y++) {
				if (twoRay[x][y].getType() == 3)
					return twoRay[x][y];
			}
		}

		return null;
	}

	/**
	 * Resets the maze back to its initial state.
	 */
	public void reset() {
		Square exit = getExit();
		Square begin = getStart();
		
		for(int i = 0; i < twoRay.length; i++)
		{
			for(int x = 0; x < twoRay[i].length; x++)
			{
				int r = oldTwoRay[i][x].getRow();
				int c = oldTwoRay[i][x].getCol();
				
				twoRay[i][x].setRow(r);
				twoRay[i][x].setCol(c);
			}
		}

	}

	@Override
	public String toString() {
		String out = "";
		for (int x = 0; x < twoRay.length; x++) {
			for (int y = 0; y < twoRay[x].length; y++) {
				out += twoRay[x][y] + " ";
			}
			out += "\n";
		}

		return out;

	}
}
