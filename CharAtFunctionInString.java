//charAt(index_value) used to take character by using index value

public class CharAtFunctionInString 
{
	public static void main(String[] args) 
	{
		String str=new String("Hello");
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		
		System.out.println("character of each word 'Hello' using loop  ");
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
	}
}
