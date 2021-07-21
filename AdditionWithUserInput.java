import java.util.Scanner;
public class AdditionWithUserInput 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First value ");
		int a =sc.nextInt();
		System.out.println("Enter Second value ");
		int b =sc.nextInt();
		int c =a+b;
		System.out.println("Addition is "+a+" and "+b+" is "+c);
	}
}
