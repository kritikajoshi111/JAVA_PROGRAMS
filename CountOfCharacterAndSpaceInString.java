//Write a program to count number of space and number of character in given String
public class CountOfCharacterAndSpaceInString 
{
	public static void main(String[] args) 
	{
		String str="This is a program in java ";
		int characterCount=0 , spaceCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				spaceCount++;
			}
			else
			{
				characterCount++;
			}
		}
		System.out.println("Total character are "+ characterCount);
		System.out.println("Total space are "+ spaceCount);
	}
}
