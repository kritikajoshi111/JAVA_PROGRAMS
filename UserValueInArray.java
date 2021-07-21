import java.util.Scanner;
public class UserValueInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter value at "+(i+1)+ "posstion");
			a[i]=sc.nextInt();
		}
		System.out.println("You have entered array values are ");
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}
