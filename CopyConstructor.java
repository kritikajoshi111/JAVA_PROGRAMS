
public class CopyConstructor 
{
	int a,b,c;
	 CopyConstructor(int x, int y, int z) 
	{
		 a=x;
		 b=y;
		 c=z;
	}
	 void show()
	 {
		 System.out.println(a+" "+b+" "+c);
	 }
	 CopyConstructor(CopyConstructor cc) 
	 {
		a=cc.a;
		b=cc.b;
		c=cc.c;
	}
	public static void main(String[] args)
	{
		CopyConstructor cc1=new CopyConstructor(10,20,30);
		CopyConstructor cc2 = new CopyConstructor(cc1);
		cc1.show();
		cc2.show();
		
		CopyConstructor cc3=new CopyConstructor(cc2);
		cc3.show();
	}
}
