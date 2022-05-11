
public class findalivekillme
{
	private static int SIZE;
	private static int neighbors;
	private static int grid[][];
	
	public static void main(String[] args)
	{
		for(int x = 0; x < SIZE; x++)
		{
			for(int y = 0; y < SIZE; y++)
			{
				if(grid[x][y].isAlive())
				{
					if(grid[x][y++].isAlive())
						neighbors++;
				}
				else if(grid[x++][y].isAlive())
					neighbors++;
			}
		}
		
		if(neighbors == 0 || neighbors == 1)
			grid[x][y].kill();
	}

}
