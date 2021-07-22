
public class SumOfArrayElements 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50}, sum=0;
		System.out.print("Array elements are  ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of array elements are "+ sum);
	}
}
