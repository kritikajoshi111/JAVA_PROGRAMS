
public class SharedMemoryConceptInString 
{
	public static void main(String[] args) 
	{
		String str1="Hello";
		String str2="Hello";
		
	}
}

//Here their are their object but all are pointer to one object only and sharing memory.
//"Hello"  is a object while has some hashcode
//str1 is pointing to "Hello" and using "Hello" object memory only
//str2 is pointing to "HEllo " and using "HEllo" object memory only