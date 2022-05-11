public class FireModel
{
    public static int SIZE = 47;
    private FireCell[][] myGrid;
    private FireView myView;

    public FireModel(FireView view)
    {
        myGrid = new FireCell[SIZE][SIZE];
        int setNum = 0;
        for (int r=0; r<SIZE; r++)
        {
            for (int c=0; c<SIZE; c++)
            {
                myGrid[r][c] = new FireCell();
            }
        }
        myView = view;
        myView.updateView(myGrid);
    }

    
    /**
     * sets the bottom row on fire and then sets the rest of the trees on fire
     * using the helper method. Sets trees on fire and then checks if the fire reaches
     * the top row of the forest. If so, it returns that Oneett is in trouble.
     */
    public void solve()
    {
        // student code here
    	/**
    	 * fire can go horizontally or vertically
    	 * (x-1, y) , (x+1, y) , (x, y-1) , (x, y+1) 
    	 * you return a 2d array of updated array
    	 * entire bottom row is on fire
    	 */
    	for(int y = 0; y < SIZE; y++)
    	{
    		if(myGrid[SIZE-1][y].getStatus() == 1)
    		{
    			helper(SIZE-1, y);
    		}
    	}
    	
    	String out = "Onett is not in trouble";
    	for(int y = 0; y < SIZE; y++)
    	{
    		if(myGrid[0][y].getStatus() == 2)
    		{
    			out = "Onett is in trouble";
    			break;
    		}
    		
    	}
    	
    	System.out.println(out);
    	
        myView.updateView(myGrid);
    }

    /**
     * we set the current tree on fire and then check the horizontal and vertical
     * and set them on fire as well
     * @param x	- x index in the 2D array
     * @param y	- y index in the 2D array
     */
    private void helper(int x, int y)
    {
    	if((x >= 0 && x < SIZE && (y >= 0 && y < SIZE)) && myGrid[x][y].getStatus() == 1)
    	{
    		myGrid[x][y].setStatus(2);
    		helper(x-1, y);
    		helper(x+1, y);
    		helper(x, y-1);
    		helper(x, y+1);
    	}
    }
}
