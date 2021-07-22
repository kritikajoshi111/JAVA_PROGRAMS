
public class CountOfOccuranceNumber 
{
	public static void main(String[] args) 
	{
		int a[]= {70,60,90,50,80,60,60,10,60,30},num=60,count=0;
		System.out.println("The elements of array are ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				count++;
			}
		}
		System.out.println("The count of occutance of "+num+ " is "+ count);
	}
}
