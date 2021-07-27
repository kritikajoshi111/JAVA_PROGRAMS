
public class FinalAndStaticVariable 
{
	static final int a;
	final static int b;
	final int c;
	static
	{
		a=10;
	}
	static
	{
		b=20;
		
	}
	public FinalAndStaticVariable() 
	{
		c=30;
	}
	void show() 
	{
		System.out.println(a+ +b+ +c);
	}
	public static void main(String[] args) 
	{
		
		FinalAndStaticVariable f=new FinalAndStaticVariable();
		f.show();
	}
}
