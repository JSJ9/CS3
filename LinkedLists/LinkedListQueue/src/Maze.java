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
		int col = s.getCol();
		int row = s.getRow();
		
		
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
		

		return list;
		

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
