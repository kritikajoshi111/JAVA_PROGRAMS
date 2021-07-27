
public class FinalVariable
{
	final int a=10;
	void show()
	{
		//a++; This line will give error because final variable didn't allow to increment .
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		
		FinalVariable f=new FinalVariable();
		f.show();
		//f.a=20; It will give error because a is final variable and we can't change value .
		
	
	}

}
