
public class IndexOfFunctionInString 
{
	public static void main(String[] args) 
	{
		String str="I am in Indore MP";
		
		System.out.println(str.indexOf('i')); // first index where letter came ex : indexOf(char)
		
		System.out.println(str.indexOf('n',7)); // first index after 7 where letter came ex:charOf(char,fromindex) -->from index means starting index from 
		
		System.out.println(str.indexOf("in")); //indexOf(string)
		
		System.out.println(str.indexOf("in",2)); //indexOf(string , fromindex)
	}
}
