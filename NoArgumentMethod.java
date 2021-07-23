ublic class NoArgumentMethod 
{
	int a,b,c;
	void show()
	{
		System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args) 
	{
		NoArgumentMethod obj1=new NoArgumentMethod();
		NoArgumentMethod obj2=new NoArgumentMethod();
		obj1.a=10;
		obj1.b=20;
		obj1.c=30;
		
		obj2.a=100;
		obj2.b=200;
		obj2.c=300;
		
		obj1.show();
		obj2.show();

		
	}
}