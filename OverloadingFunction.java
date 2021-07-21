
public class OverloadingFunction 
{
	public static void main(String[] args) 
	{
		AreaOfShapes a= new AreaOfShapes();
		a.area(5);
		a.area(10,20);
		a.area(1.5,2.5);
	}
}
class AreaOfShapes
{
	void area(int x, int y)
	{
		int z=x*y;
		System.out.println("Area of rectangle is " + z);
	}
	void area(double x , double y)
	{
		double z =x*y;
		System.out.println("Area of triangle is "+z);
	}
	void area(int x)
	{
		double z=3.14*x*x;
		System.out.println("Area of circle is "+z);
	}
}
