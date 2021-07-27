
public class FinalVariableUsingConstructor 
{
	final int a;
	FinalVariableUsingConstructor(int x)
	{
		a=x;
	}
	void show()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		FinalVariableUsingConstructor f1=new FinalVariableUsingConstructor(100);
		FinalVariableUsingConstructor f2=new FinalVariableUsingConstructor(200);
		f1.show();
		f2.show();
	}
}
