//A year where 29 days in february or 366 DAYS in year are leap year or its comes after every 4 years
public class LeapYear 
{
	public static void main(String[] args) 
	{
		int year=2017;
		if(year%400==0)
		{
			System.out.println("It is a leap year");
		}
		else if(year%100==0)
		{
			System.out.println("It is a non-leap year");
		}
		else if(year%4==0)
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is non-leap year");
		}
	}
}
