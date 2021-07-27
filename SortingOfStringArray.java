
public class SortingOfStringArray 
{
	public static void main(String[] args) 
	{
		String str[]= {"indore","bhopal","dress","dhar","ujjain","india","indonesha","bhind"};
		String temp;
		for(int i=0;i<(str.length-1);i++)
		{
			for(int j=(i+1);j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)  	//compare function will return positvie value if str j is greater else it will provide negative number or 0
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(String s:str)
		{
			System.out.println(s);
		}
	}
}
