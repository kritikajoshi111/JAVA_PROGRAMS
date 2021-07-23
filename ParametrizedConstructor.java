
public class ParametrizedConstructor 
{
	int a,b,c;
	public ParametrizedConstructor(int x, int y ,int z)  // parametized constructor
	{
		a=x;
		b=y;
		c=z;
	}
	void show() 
	{
		System.out.println(a+" "+b+" "+c);
	}
	public ParametrizedConstructor()  // default constructor
	{
		
	}
	public static void main(String[] args) 
	{
		ParametrizedConstructor p1=new ParametrizedConstructor(10,20,30);
		ParametrizedConstructor p2 = new ParametrizedConstructor(100, 200, 300);
		p1.show();
		p2.show();
		
		ParametrizedConstructor p3= new ParametrizedConstructor();
		p3.show();
		
	}
}
