
public class StaticVariable 
{
	static int a;
	public static void main(String[] args)
	{
		a=10;
		System.out.println(a);
		StaticVariable s1=new StaticVariable();
		s1.a=100;
		System.out.println(s1.a);
		StaticVariable s2=new StaticVariable();
		s2.a=1000;
		System.out.println(s2.a);
		StaticVariable s3=new StaticVariable();
		s3.a=10000;
		System.out.println(s3.a);
		
		System.out.println(StaticVariable.a);
		System.out.println(a);
		
		
		
	}
}
