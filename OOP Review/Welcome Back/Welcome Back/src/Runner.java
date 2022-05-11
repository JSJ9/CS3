import java.util.Arrays;

public class Runner
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WelcomeBack wb = new WelcomeBack();
		
		System.out.println("getMiddle()");
		System.out.println("---------------------------------");
		
		System.out.println("Testing getMiddle(\"two\"):: " + wb.getMiddle("two"));
		System.out.println("Testing getMiddle(\"even\"):: " + wb.getMiddle("even"));
		System.out.println("Testing getMiddle(\"janine\"):: " +wb.getMiddle("janine"));
		System.out.println("Testing getMiddle(\"is\"):: " + wb.getMiddle("is"));
//		System.out.println("Testing getMiddle(\"is\"):: " + wb.getMiddle("is"));
		
		//sumNumbers
		
		System.out.println("\nsumNumbers()");
		System.out.println("---------------------------------");
		int arr[] = wb.sumNumbers(5);
		System.out.println("Testing sumNumbers(5) :: " + Arrays.toString(arr));
		arr = wb.sumNumbers(1);
		System.out.println("Testing sumNumbers(1) :: " + Arrays.toString(arr));
		arr = wb.sumNumbers(0);
		System.out.println("Testing sumNumbers(0) :: " + Arrays.toString(arr));
		arr = wb.sumNumbers(10);
		System.out.println("Testing sumNumbers(10) :: " + Arrays.toString(arr));
		
		
		System.out.println("\nsumDigits()");
		System.out.println("---------------------------------");
		System.out.println("Testing sumDigits(234) " + wb.sumDigits(234));
		System.out.println("Testing sumDigits(111) " + wb.sumDigits(111));
		System.out.println("Testing sumDigits(579) " + wb.sumDigits(579));
		System.out.println("Testing sumDigits(666) " + wb.sumDigits(666));
		

		System.out.println("\nkeepSummingDigits()");
		System.out.println("---------------------------------");
		System.out.println("Testing sumDigits(234) :: " + wb.keepSummingDigits(234));
		System.out.println("Testing sumDigits(579) :: " + wb.keepSummingDigits(579));
		System.out.println("Testing sumDigits(12345) :: " + wb.keepSummingDigits(12345));
		System.out.println("Testing sumDigits(666) :: " + wb.keepSummingDigits(666));
		
		
		System.out.println("\ngetIntersection()");
		System.out.println("---------------------------------");
		int[] a = {1,2,3,4};
		int[] b = {9,0,4,3,4,1};
		System.out.println("Testing array a(" + Arrays.toString(a) + ") and array b(" + Arrays.toString(b) + ")  :: " + wb.getIntersection(a, b));
		
		int[] c = {2,4,6,8};
		int[] d = {3,5,6,8,1,4,2,7,9};
		System.out.println("Testing array c(" + Arrays.toString(c) + ") and array d(" + Arrays.toString(d) + ")  :: " + wb.getIntersection(c, d));
		
		int[] e = {1,3,5};
		int[] f = {4,2,6};
		System.out.println("Testing array e(" + Arrays.toString(e) + ") and array f(" + Arrays.toString(f) + ")  :: " + wb.getIntersection(e, f));
		
		int[] g = {1,3,5,7};
		int[] h = {4,2,6,7};
		System.out.println("Testing array g(" + Arrays.toString(g) + ") and array h(" + Arrays.toString(h) + ") :: " + wb.getIntersection(g, h));
		
		
		System.out.println("\nsumDigitsRecur()");
		System.out.println("---------------------------------");
		System.out.println("Testing sumDigitsRecur(234) :: " + wb.sumDigitsRecur(234));
		System.out.println("Testing sumDigitsRecur(579) :: " + wb.sumDigitsRecur(579));
		System.out.println("Testing sumDigitsRecur(12345) :: " + wb.sumDigitsRecur(12345));
		System.out.println("Testing sumDigitsRecur(666) :: " + wb.sumDigitsRecur(666));
		
		
		System.out.println("\nsumWithoutCarry()");
		System.out.println("---------------------------------");
		System.out.println("Testing sumWithoutCarry(861, 3450) :: " + wb.sumWithoutCarry(861, 3450));
		System.out.println("Testing sumWithoutCarry(6969, 420) :: " + wb.sumWithoutCarry(6969, 420));
		System.out.println("Testing sumWithoutCarry(1, 2345) :: " + wb.sumWithoutCarry(1, 2345));
		System.out.println("Testing sumWithoutCarry(1, 0) :: " + wb.sumWithoutCarry(1, 0));
		
		
		System.out.println("\nsbuySell1()");
		System.out.println("---------------------------------");
		int[] stock = {3,4,3,2,1,5};
		System.out.println("Testing stock (" + Arrays.toString(stock) + ") :: " + wb.buySell1(stock));
		int[] stock2 = {1,2,3,4,5,9};
		System.out.println("Testing stock2 (" + Arrays.toString(stock2) + ") :: " + wb.buySell1(stock2));
		int[] stock3 = {5,4,3,2,1,1};
		System.out.println("Testing stock3 (" + Arrays.toString(stock3) + ") :: " + wb.buySell1(stock3));
		int[] stock4 = {0,1};
		System.out.println("Testing stock4 (" + Arrays.toString(stock4) + ") :: " + wb.buySell1(stock4));
	}

}