
public class VariableAsArguments 
{
	void add(int ...a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		VariableAsArguments v =new VariableAsArguments();
		v.add(10,20,30,40,50);
		v.add(1,2,3,4,5,6,7);
		
		int x[]= {10,20,30,40,50};
		v.add(x);
	}
}
