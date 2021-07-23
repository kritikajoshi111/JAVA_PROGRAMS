//It is components of class type that is capable to hold the hash code of an object of same class .It is also capable to access or change its value.

public class ReferenceVariable 
{
	int a=10;
	public static void main(String[] args) 
	{
		ReferenceVariable r1=new ReferenceVariable(); 		// creating object
		ReferenceVariable r2=r1; 							 // creating reference variable
		System.out.println(r1.a);
		System.out.println(r2.a);
		r1.a++;
		r2.a--;
		System.out.println(r1.a);
		System.out.println(r2.a);
	}
}

//Here t2 copy the hashcode of t1 and t2 acts as a pointer to hold the hashcode of t1. 
//Here t2 have same data and only contain one memory.

