//Run Time Polymorphism and Method overriding is same

public class RunTimePolymorphism 
{
	public static void main(String[] args)
    {
  
        Parentclass a= new Parentclass();
        a.Print();
        
        subclass1 b = new subclass1();
        b.Print();
  
        subclass2 c = new subclass2();
        c.Print();
    }
}
class Parentclass
{
    void Print()
    {
        System.out.println("parent class");
    }
}
class subclass1 extends Parentclass 
{
    void Print()
    {
        System.out.println("subclass1");
    }
}
class subclass2 extends Parentclass 
{
    void Print()
    {
        System.out.println("subclass2");
    }
}