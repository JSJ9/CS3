import java.awt.Color;
import java.awt.Font;

enum GemType {
    GREEN, BLUE, ORANGE; //define the different types of Gems, comma delimited
}

public class Gem 
{	
	private int points;
	private GemType gt;
	
	/**
	 * Instantiates gem to a random color and points to a random integer val between 0 and 50
	 */
	public Gem()
	{
		points = (int) (Math.random() * 11) * 5;
		int gameType = (int) (Math.random() * 3);
		
		if(gameType == 0)
			gt = gt.BLUE;
		else if(gameType == 1)
			gt = gt.GREEN;
		else
			gt = gt.ORANGE;
	}
	
	/**
	 * Instantiates the gemtype to type and points to points
	 * @param type	- the type of gem being instantiated
	 * @param points	- points with the gem
	 */
	public Gem(GemType type, int points)
	{
		gt = type;
		this.points = points;
	}
	
	/**
	 * @return	- the type of gemtype the gem is.
	 */
	public GemType getType()
	{
		return gt;
	}
	
	/**
	 * @return	- the instance variable points value
	 */
	public int getPoints()
	{
		return points;
	}
	
	/**
	 * prints out the gemtype (GREEN, ORANGE, BLUE) and the points.
	 */
	public String toString()
	{
		return gt.toString() + " " + getPoints();
	}
	
	/**
	 * Determines the image of the gem by determining what gem it is and the font 
	 * of the points
	 * @param x	- the x value of where the gem is being printed.
	 * @param y	- the y value of where the gem is being printed.
	 */
	public void draw(double x, double y)
	{
		String fileName = "";
		
		if(gt == gt.GREEN)
			fileName = "gem_green.png";
		else if(gt == gt.ORANGE)
			fileName = "gem_orange.png";
		else
			fileName = "gem_blue.png";
		
		StdDraw.picture(x, y, fileName);
		StdDraw.setFont(new Font("SansSerif", Font.BOLD, 16));
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.text(x, y, "" + points);
		
		
	}
	
	/** Tester main method */
	public static void main(String [] args)
	{
		final int maxGems = 16;
		
		// Create a gem of each type
		Gem green  = new Gem(GemType.GREEN, 10);
		Gem blue   = new Gem(GemType.BLUE, 20);
		Gem orange = new Gem(GemType.ORANGE, 30);
		System.out.println(green  + ", " + green.getType()  + ", " + green.getPoints());		
		System.out.println(blue   + ", " + blue.getType()   + ", " + blue.getPoints());
		System.out.println(orange + ", " + orange.getType() + ", " + orange.getPoints());
		green.draw(0.3, 0.7);
		blue.draw(0.5, 0.7);
		orange.draw(0.7, 0.7);
		
		// A row of random gems
		for (int i = 0; i < maxGems; i++)
		{
			Gem g = new Gem();
			g.draw(1.0 / maxGems * (i + 0.5), 0.5);
		}
	}
}
