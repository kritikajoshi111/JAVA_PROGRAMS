public class AbstractExample 
{
	public static void main(String[] args) 
	{
		B b= new B();
		b.show();
		b.disply();	
		A a;
		a=b;
		a.disply();
		a.show();
	}
}
abstract class A
{
	abstract void show();
	void disply()
	{
		System.out.println("Hello from Display Method");	
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Hello from Show Method"); // compulsory to overwrite abstract method of parent class
	}
}