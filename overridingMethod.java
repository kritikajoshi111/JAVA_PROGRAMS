public class overridingMethod 
{
	public static void main(String[] args) 
	{
		A a=new A();
		B b =new B();
		a.show();
		b.show(); // It is giving priority to its own method not to other methods
	}
}
class A
{
	void show()
	{
		System.out.println("Hello from class A");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Hello from class B"); 
	}
}