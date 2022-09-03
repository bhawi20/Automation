package pkg1;
//its like a method
//constructor name and class name will be same
//no return type(no void/no-void)
//no need to call it will be called as we create the object of the class

public class Constructor 
{
	public Constructor()
	{
		System.out.println("Default Constructor");
	}
	public Constructor(int a)
	{
		System.out.println("one parameterized Constructor");
	}
	public Constructor(int a, int b)
	{
		System.out.println("two parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		Constructor ref1=new Constructor(12,66); //2 parameterized 
		Constructor ref2=new Constructor(); // default
		Constructor ref3=new Constructor(33); // one parameterized 
		
	}
		

}
