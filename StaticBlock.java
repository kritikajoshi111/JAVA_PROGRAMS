
public class StaticBlock 
{
	static int a=10;			//first this will execute
	static void show()			//seventh
	{
		System.out.println(a+5);
	}
	static						//second this will execute
	{
		a=a*15;
		System.out.println(a);
	}
	public static void main(String[] args) //third this will execute
	{ 
		System.out.println("Hello");	//fourth
		System.out.println(a);  		//fifth
		StaticBlock.show();				//sixth
		System.out.println(StaticBlock.a); //eighth
	}
}
