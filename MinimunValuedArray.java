
public class MinimunValuedArray
{
	public static void main(String[] args)
	{
		int a[]= {60,70,80,10,20,30,40,50}, min=a[0];
		System.out.print("Array elements are  ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum value in given array is "+min);
	}

}
