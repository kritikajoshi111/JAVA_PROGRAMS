//palindrome number -> if we reverse a number it will give us the same number.
public class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=151, reverse=0,reminder;
		int actual=num;
		System.out.println("Actual number is "+actual);
		while(num!=0)
		{
			reminder=num%10;
			reverse=reminder+reverse*10;
			num=num/10;
		}
		System.out.println("The reverse number is "+reverse);
		if(reverse==actual)
		{
			System.out.println("It is a Palindrome number");
		}
		else
		{
			System.out.println("It is not a Palindrome number");
		}
	}

}
