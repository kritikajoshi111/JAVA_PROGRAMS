/*
 In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also act as the base class to other class. 
 In the below image, class one serves as a base class for the derived class two, which in turn serves as a base class for the derived class three
 */
public class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
		 three g = new three();
	        g.print_one();
	        g.print_two();
	        g.print_one();
	}
}
class one 
{
    public void print_one()
    {
        System.out.println("Hello for class one");
    }
}
class two extends one 
{
    public void print_two()
    { 
    	System.out.println("Hello from class two"); 
    }
}
class three extends two 
{
    public void print_one()
    {
        System.out.println("Hello from class three");
    }
}
 
