
public class ReturnByValueMethod 
{
	int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		ReturnByValueMethod r= new ReturnByValueMethod();
		int x=r.add(10,20);
		System.out.println(x);
		
		System.out.println(r.add(100, 200));
		
		
	}
}
