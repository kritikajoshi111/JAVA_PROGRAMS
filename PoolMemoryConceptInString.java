
public class PoolMemoryConceptInString 
{
	public static void main(String[] args) 
	{
		String str1=new String("Hello");
		String str2 =new String("Hello");
	}
}

//Here three object are their "Hello" , str1,str2
//"Hello" is object and have some hashcode( ex- ABC123) and also  different memory allocated
//str1 is a object that have "Hello" object hashcode as value and str1 have some hashcode(ex-DEF123) and also  different memory allocated
//str2 is a object that have "Hello" object hashcode as value and str2 have some hashcode(ex-XYZ123) and also  different memory allocated