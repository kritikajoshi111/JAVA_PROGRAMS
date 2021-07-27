public class StringExample1 
{
	public static void main(String[] args) 
	{
		String str=new String("Hello");  // predefined class String  
		System.out.println(str);     //String variable will print the data if we direct passs object but other variable will print hashCode of the object
		System.out.println(str.hashCode());  //This function is used to print hashcode of the object in string
		System.out.println(str.length());   // This function is used to print length of String but in array we are using a.length to print length of array a.
		
	}
}
