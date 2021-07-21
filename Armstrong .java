//armstrong number ->153 = cube of 1 + cube of 5 + cube of 3 = 153 
public class Armstrong 
{
	public static void main(String[] args) 
	{
		int num=153,digit,sum=0;
		int Given_number=num;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(Given_number==sum)
		{
			System.out.println("This is an Armstrong number");
		}
		else
		{
			System.out.println("This is not an Armstrong number");
		}
	}
}