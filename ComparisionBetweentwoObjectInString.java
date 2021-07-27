
public class ComparisionBetweentwoObjectInString 
{
	public static void main(String[] args) 
	{
		String str1=new String("Hello");
		String str2 =new String("Hello");
		
		//== operator with object
		
		if(str1==str2)   					//operator (==)in object work on hardware so hashcode of str1 and str2 is different .
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}	
		
		// == operator with hashcode function
		
		if(str1.hashCode()==str2.hashCode()) //method str1.hashCode and str2.hashcode work on software so it will take value means "Hello"
		{
			System.out.println("Same");
		}
		else
		
		{
			System.out.println("Different");
		}
		
		//str.equals(str2) used to check both values are equal or not 
		
		if(str1.equals(str2))  //It compare value rather then hashcode
		{

			System.out.println("Same");
		}
		else
		
		{
			System.out.println("Different");
		}
		
		//str.equalsIgnoreCase(str1) used to check both value are equal or not with ignoring case sensitivity
		
		if(str1.equalsIgnoreCase(str2))  //It compare value rather then hashcode and also case insensitive
		{

			System.out.println("Same");
		}
		else
		
		{
			System.out.println("Different");
		}
		
		
		
	}
}
