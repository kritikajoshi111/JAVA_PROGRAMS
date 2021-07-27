//Write a program to print all index of "in" string in given Sentence
public class IndexofStringInGivenSentence 
{
	public static void main(String[] args) 
	{
		String str="indore is in india";
		int x=0;
		while(x!=(-1))
		{
			x=str.indexOf("in",x);
			if(x>=0)
			{
				System.out.println(x);
				x++;
			}
		}
	}
}
