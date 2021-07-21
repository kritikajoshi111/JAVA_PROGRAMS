
public class SwitchCase_Vowel 
{
	public static void main(String[] args) 
	{
		char ch ='e';
		switch(ch)
		{
			case 'a': System.out.println(ch +" is vowel");
						break;
			case 'e': System.out.println(ch +" is vowel");
						break;
			case 'i': System.out.println(ch +" is vowel");
						break;
			case 'o': System.out.println(ch +" is vowel");
						break;
			case 'u': System.out.println(ch +" is vowel");
						break;
			default:System.out.println(ch +" is Consonent");
						break;
		}
		
	//method second 	
		char ch1='i';
		switch(ch1)
		{
			case 'a': 
			case 'e': 
			case 'i':
			case 'o':
			case 'u': System.out.println(ch1 +" is vowel");
						break;
			default:System.out.println(ch1 +" is Consonent");
						break;
		}
	
		//using If else
		char ch2='i';
		if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u')
		{
			System.out.println(ch2 +" is vowel");
		}
		else
		{
			System.out.println(ch +" is consonent");
		}		
	}		
}
