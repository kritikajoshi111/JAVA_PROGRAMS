
public class Inheritance1 
{
	public static void main(String[] args) 
	{
		System.out.println("inheritance  Example");
		A a1=new A();
		B b1= new B();
		a1.show();
		b1.show();
		b1.display();
	}
}
class A
{
	void show()
	{
		System.out.println("Hello from Class A");
	}
}
class B extends A
{
	void display()
	{
	System.out.println("Hello from Class B");
	}
}
