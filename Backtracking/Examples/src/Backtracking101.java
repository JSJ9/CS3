
public class Backtracking101 
{
	public void printBinary(int n)
	{
		if(n == 0)
			System.out.println();
		else
			printBinaryHelper(n, "");
	}
	
	private void printBinaryHelper(int n, String out)
	{
		if(out.length() == n) //string is required length
			System.out.print(out + " ");
//		if(failure)
//			return
		else
		{
			printBinaryHelper(n, out + "0");
			printBinaryHelper(n, out + "1");
		}
	}
	
	public static void main(String[] args) {
		Backtracking101 b = new Backtracking101();
		
		b.printBinary(4);
	}
}
