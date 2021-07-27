//Write a program to count vowel and consonent in the string
public class VowelAndConsonentInString 
{
	public static void main(String[] args)
	{
		String str="This is a program in java";
		int vowel=0,consonent=0;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'|str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'|str.charAt(i)=='U')
			{
				vowel++;
			}
			else if(str.charAt(i)==' ')
			{
				continue;
			}
			else{
					consonent++;
				}
		}
		System.out.println("This is a program in java");
		System.out.println("Total count of vowel are "+ vowel);
		System.out.println("Total count of consonent  are "+ consonent);
	}
}
