// it return 0 when string is exact same and return some value if different.
//str.compareToIgnoreCase(str2) used to compare to string and return some value if different in letter or word. It ignore the case insensitive.

public class CompareToIgnoreCaseFunctionInString 
{
	public static void main(String[] args) 
	{
		String str1=new String("Hello");
		String str2=new String ("Hello");
		String str3=new String ("hello");
		String str4=new String ("HELLO");
		String str5=new String ("Hellp");
		String str6=new String ("Indore");
		String str7=new String ("HelloIndore");
		
		int x = str1.compareToIgnoreCase(str2);  
		System.out.println(x);
		
		int y=str1.compareToIgnoreCase(str3);
		System.out.println(y);
		
		int z=str3.compareToIgnoreCase(str1);
		System.out.println(z);
		
		int a=str3.compareToIgnoreCase(str4);
		System.out.println(a);
		
		int b=str1.compareToIgnoreCase(str5);
		System.out.println(b);
		
		int c=str1.compareToIgnoreCase(str6);
		System.out.println(c);
		
		int d=str1.compareToIgnoreCase(str7);
		System.out.println(d);
		

	}
}
