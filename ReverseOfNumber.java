public class ReverseOfNumber 
{

	public static void main(String[] args) 
	{
		//153 reverse is 351 .. 153%10=3 .. 153/10=15 ... 15%10=5 ... 15/10=1...1%10=1... 1/10=0.1(loop exit)
		
		int num=153,sum=0;
		int reverse;
		while(num!=0)
		{
			reverse=num%10;
			System.out.print(sum*10+reverse);
			num=num/10;
		}
		
	}

}
