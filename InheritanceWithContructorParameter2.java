
public class InheritanceWithContructorParameter2 
{
	public static void main(String[] args)
	{
		I i = new I(10,20);
		J j=new J(100,200,300);
	}
}
class I
{
	I(int x, int y)
	{
		System.out.println("Values of class I is " + x +" "+ y);
	}
}
class J extends I
{
	J(int x, int y , int z)
	{
		super(x,y);
		System.out.println("Values of class J is "+ x+ " "+y+" "+z);
	}
}

