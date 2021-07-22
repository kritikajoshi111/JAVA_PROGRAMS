
public class FindElementsInArray 
{
	public static void main(String[] args) 
	{
		int a[]= {60,70,80,10,20,30,40,50},num=20,flag=0;
		System.out.print("Array elements are  ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println(num +" found in Array");
		}
		else
		{
			System.out.println(num +" not found in Array");
		}
		
	}
}
