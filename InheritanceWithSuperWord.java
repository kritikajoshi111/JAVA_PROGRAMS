public class InheritanceWithSuperWord 
{
	public static void main(String[] args) 
	{
		F f=new F();
		f.show();
	}
}
class E
{
	int a=10;
}
class F extends E
{
	int a=20;
	void show()
	{
		System.out.println("Class F a value is "+ this.a);
		System.out.print("class E a value is "+ super.a);  //super is and static reference variable that holds the object of parent class'
	}
}