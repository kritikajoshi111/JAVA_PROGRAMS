public class Fibanaccie 
{

	public static void main(String[] args) 
	{
		int a=0 , b=1,c, n=10 ,k=1;
		while(k<=n)
		{
			c=a+b;
			System.out.print(a + "\t");
			a=b;
			b=c;
			k++;
		}

	}

}