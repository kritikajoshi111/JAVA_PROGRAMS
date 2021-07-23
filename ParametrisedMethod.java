// This is also called call by value concept
public class ParametrisedMethod 
{	
	int a,b,c;
	void show()  // no parameter method
	{
		System.out.println(a+" "+b+" "+c);
	}
	void setData(int x, int y , int z)			//parametrised method 
	{
		a=x;
		b=y;
		c=z;
	}
	public static void main(String[] args)
	{
		ParametrisedMethod p1=new ParametrisedMethod();
		ParametrisedMethod p2=new ParametrisedMethod();
		p1.a=10;
		p1.b=20;
		p1.c=30;		// no parameter method value passed
		p1.show();
		
		p1.setData(600,700, 800); // parametrised method value passed
		p1.show();
		
		p2.setData(100, 200, 300);
		p2.show();
	}
}
