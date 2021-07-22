
public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		
		System.out.println("Original Series is ");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Reverse Series is ");
		for(int i=(a.length-1);i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
