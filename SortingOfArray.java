
public class SortingOfArray 
{
	public static void main(String[] args) 
	{
		int a[]= {50,80,60,40,20,10,30,70} ,j,temp;
		System.out.print("Array elements are  ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		for(int i=0;i<(a.length-1);i++)
		{
			for(j=(i+1);j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Sorted Array elements are  ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
