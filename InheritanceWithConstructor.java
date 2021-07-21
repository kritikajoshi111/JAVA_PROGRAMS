
public class InheritanceWithConstructor 
{
	public static void main(String[] args) 
	{
		G g= new G(); // we can only call constructor with new 
		H h =new H(); 
	}
}
class G
{
	G()
	{
		System.out.println("Hello from G");
	}
}
class H extends G
{
	H()
	{
		System.out.println("Hello from H"); //whenever the object of child class will be created it will forward a request of memory allocation to the default consutructor of parent class 
	}
}
