
public class Inheritance2 
{
	public static void main(String[] args)
	{
		D b1= new D();
		D b2=new D();
		b1.setData(10, 20, 30);
		b1.show();
		b2.setData(40, 50, 60);
		b2.show();
		
		C a1=new C();
		a1.show();
	}
}

class C
{
	int a=10,b,c;
	void show()
	{
		System.out.println("a="+ a + " b =" +b + " c="+c);
	}
}
class D extends C
{
	void setData(int x , int y , int z)
	{
		a=x;
		b=y;
		c=z;
	}
}