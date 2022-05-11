import java.io.IOException;

public class ZeckRunner
{
	public static void main(String[] args) throws IOException
	{
		Zeckendorf zeck = new Zeckendorf();
		
		
		System.out.println(zeck.findFib(120));
		System.out.println(zeck.fibList(10));
		
	}
}