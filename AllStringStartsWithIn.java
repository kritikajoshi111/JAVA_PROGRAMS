
public class AllStringStartsWithIn 
{
	public static void main(String[] args) 
	{
		String str[]= {"indore","bhopal","dress","dhar","ujjain","india","indonesha","bhind"};
		for(int i=0;i<str.length;i++)
		{
			if(str[i].indexOf("in")==0)
			{
				System.out.println(str[i]);
			}
		}
	}
}
