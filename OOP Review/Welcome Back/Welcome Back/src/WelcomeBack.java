import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WelcomeBack
{
	public String getMiddle(String str)
	{
		if (str.length() % 2 == 1)
			return str.substring(str.length() / 2, str.length() / 2 + 1);
		else
			return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
	}

	public int[] sumNumbers(int n)
	{
		int[] output = new int[n + 1];
		int count = 0;

		for (int x = 0; x < n + 1; x++)
		{
			count += x;
			output[x] = count;

		}

		return output;
	}

	int sumDigits(int num)
	{

		String number = "" + num;
		int out = 0;

		for (int i = 0; i < number.length(); i++)
		{
			out += Integer.parseInt(number.substring(i, i + 1));
		}

		return out;
	}

	int keepSummingDigits(int num)
	{
		String number = "" + num;
		int out = 0;
		
		if(number.length() < 2)
			return num;
		
		while(number.length() >= 2) {
			
			out = 0; 
			
			for(int i = 0; i < number.length(); i++)
			{
				out += Integer.parseInt(number.substring(i, i + 1));
			}
			
			number = "" + out;
		}
		
		return out;

	}
	
	public String getIntersection(int[] a, int[] b)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		
		String numsMatched = "";
		
		for(int x = 0; x < a.length; x++)
		{
			for(int y = 0; y < b.length; y++)
			{
				if(a[x] == b[y] && !numsMatched.contains(""+a[x]) && !numsMatched.contains(""+b[y]))
					numsMatched += "" + b[y];
			}
		}
		
		if(numsMatched.length() == 0)
			return "No match found!";
		
		return numsMatched;
	}
	
	public int sumDigitsRecur(int num) {
		return num <= 9 ? num : sumDigitsRecur(num % 10 + sumDigitsRecur(num / 10));
	}

	
	public int sumWithoutCarry(int a, int b) {
		
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		String out = "";
		
		while(true) {
			if(a == 0 && b == 0)
				break;
			
			sum = (a % 10) + (b % 10);
			sum %= 10;
			
			list.add(sum);
			
			a /= 10;
			b /= 10;
			
		}
		
		Collections.reverse(list);
		for(int i = 0; i < list.size(); i++)
			out += list.get(i);
		
		return Integer.parseInt(out);
		
	}
	
	public int buySell1(int[] stock) {
		
		int max = 0;
		
		for(int x = 0; x < stock.length; x++)
		{
			for(int y = x+1; y < stock.length; y++)
			{
				if(stock[y] - stock[x] > max)
				{
					max = stock[y] - stock[x];
				}
			}
		}
		
		return max;
	}
	
	

}