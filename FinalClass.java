
public class FinalClass
{
	public static void main(String[] args) 
	{
		D a=new D();
		a.show();
		//B b=new B();
		//b.show();
	}
}
final class D
{
	final void show()
	{
		System.out.println("Hello from class D");
	}
}
/*class B extends D	 // This class will show error because in parent class is declare as final so we cannot inherited .
{
	void show()  
	{
		System.out.println("Hello from method B");
	}
}
*/