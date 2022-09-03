package pkg1;

public class Class1 
{ // boundary of the class
	
	int a; // variable 
	public void bhawna() // () indicate this is a method
	{  // boundary of the method
		System.out.println("Automation Class");
	}
	
	public static void main(String[] args)
	{
		Class1 abc = new Class1();
		abc.bhawna();
		abc.a=20;
		System.out.println(abc.a);
		abc.a=50;
		System.out.println(abc.a);
		
	}

}
