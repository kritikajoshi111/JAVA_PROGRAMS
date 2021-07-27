public class FinalMethod
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.show();
		//B b=new B();
		//b.show();
	}
}
class A
{
	final void show()
	{
		System.out.println("Hello from method A");
	}
}
/*class B extends A
{
	void show()  // This method will show error because in parent class this method is declare as final method so we cannot overwrite 
	{
		System.out.println("Hello from method B");
	}
}
*/