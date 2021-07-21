
public class Factorial 
{

	public static void main(String[] args) 
	{
		//5! = 1*2*3*4*5 = 120
		
		int i, num=5 , result=1;
		for(i=1;i<=num;i++)
		{
			result=result*i;
		}
		System.out.println("factorical of 5 is "+result);
		
	}

}
