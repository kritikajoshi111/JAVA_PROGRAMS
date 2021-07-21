public class SummationOfNumber 
{

	public static void main(String[] args) 
	{
		//summation means adding of all number in given number . Ex= 153=1+5+3=9 
		
		int num=153, sum=0,r;
		while(num!=0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println(sum);
		

	}

}