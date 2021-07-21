// In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass. 
//In the below code, class W serves as a base class for the derived class X, Y and Z.
public class HierarchicalInheritance 
{
	public static void main(String[] args) 
	{
		 W w= new W();
		 w.print_W();
		 
		 X x = new X();
	     x.print_W();
	     x.print_X();
	 
	     Y y = new Y();
	     y.print_W();
	     y.print_Y();
	 
	     Z z = new Z();
	     z.print_W();
	     z.print_Z();
	}
}
class W 
{
    public void print_W() 
    { 
    	System.out.println("Class W"); 
    }
}
class X extends W 
{
    public void print_X() 
    { 
    	System.out.println("Class X"); 
    }
}
class Y extends W {
    public void print_Y() 
    { 
    	System.out.println("Class Y"); 
    }
}
 
class Z extends W 
{
    public void print_Z() 
    { 
    	System.out.println("Class Z"); 
    }
}
 
