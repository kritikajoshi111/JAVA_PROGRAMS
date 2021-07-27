//Write a program to print all character in upper case.

public class CharacterInUpperCase 
{
	public static void main(String[] args) 
	{
		String str="This is the program of java";
		String str1=str.toUpperCase(); 		//this function is used to print all letter in Upper Case
		System.out.println(str);
		System.out.println(str1);
		
		//Below is the method is used to manual print th character in upper case.
		
		for(int i=0;i<str.length();i++)      
		{
			if(str.charAt(i)>96&&str.charAt(i)<122)
			{
				System.out.print((char)(str.charAt(i)-32));
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}
	}
}
