public class IndexOfGivenNumber 
{
	public static void main(String[] args) 
	{
		int a[]= {50,80,60,40,20,10,30,70} ,num=60;
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
				System.out.println("The index of "+a[i]+ " is "+ i);
			}
		}
		
	}
}