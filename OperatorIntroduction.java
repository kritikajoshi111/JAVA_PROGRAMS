public class OperatorIntroduction 
{

	public static void main(String[] args) 
	{
		int a=10;
		System.out.println("value of a ="+ a);
		
		byte b=10;
		b=(byte)(b+5);
		System.out.println("Byte code conversion ="+ b);
		
		byte c=10,d=20,e;
		e=(byte)(c+d);
		System.out.println("three variable addtion is "+e);
		
		byte f=125,g=5,h;
		h=(byte)(f+g);
		System.out.println("three variable addtion is "+h);
		
		short i=125,j=5,k;
		k=(short)(i+j);
		System.out.println("short variable "+ k);
		
		float A=10.5f;
		System.out.println("float value"+A);
		
		double B=10.5f;
		System.out.println("double value "+B);
		
		float C=10;
		System.out.println("int is small then float it will autoconvert " + C);
		
		char ch='A';
		System.out.println("character print "+ ch);
		
		char chr=65;
		System.out.println("character by value "+ chr);
	
		boolean x;
		x=(10<15);
		System.out.println(x);
		
		int D=10;
		System.out.println("post increment operator"+ ++D);
		System.out.println("post increment operator"+ D++);
		D++;
		System.out.println("post increment operator"+ D);
		
		int E=10&7;
		System.out.println(E);
		
		int K=10, L=20, M=30;
		K=K>L?(K>M?K:M):(L>M?L:M);
		System.out.println(K);
		
		
	}

}
