package pkg1;

public class ThisKeyword {

	public ThisKeyword()
	{
		
		System.out.println("Default Constructor");
	}
	public ThisKeyword(int a)
	{
		this();// it will call default parameterized construction 
		System.out.println("one parameterized Constructor");
	}
	public ThisKeyword(int a, int b)
	{
		this(344); //it will call one parameterized construction
		System.out.println("two parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		ThisKeyword ref1=new ThisKeyword(12,66); //control will go to two parameter
		
		
	}
		

}

