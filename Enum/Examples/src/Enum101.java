
public class Enum101 {
	Day day;
	
	//Constructor
	public Enum101(Day day)
	{
		this.day = day;
	}
	
	public void dayIsLike()
	{
		switch(day)
		{
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Friday's are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so");
			break;
		}
	}
	
	public void isItWeekend()
	{
		Day d1 = Day.valueOf("SATURDAY");
		Day d2 = Day.valueOf("SUNDAY");
		
		if(day == d1 || day == d2)
		{
			System.out.println("It is time to get sleep");
		}
		else
			System.out.println("It's NOT the weekend, stay awake");
	}
	public static void main(String[] args)
	{
		String str = "SATURDAY";
		Enum101 t1 = new Enum101(Day.valueOf(str));
		t1.dayIsLike();
		t1.isItWeekend();
	}
}
