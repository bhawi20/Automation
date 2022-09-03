package pkg1;

public class Arithmetic
{
	//int bhawna; //global variable 
	public int sum(int a,int b)
	{
		//bhawna=bhawna+1;
		int c;
		c=a+b;
		System.out.println("Sum is " +c);
		System.out.println("I am sharing the latest code");
		return c ;
		
	}
	
	public int sub(int x,int y)
	{
		//bhawna=bhawna+1;
		int z;
		z=x-y;
		System.out.println("Sub is " +z);
		return z;
		
	}
	
	public void multi(int a1,int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("final result is " +a3);
		System.out.println();
	}
	public static void main(String[] args)
	{
		Arithmetic ob=new Arithmetic();
		int sumResult=ob.sum(10, 2); //sumResult storing the value of sum
		int subResult=ob.sub(12, 2);
		ob.multi(sumResult, subResult);
		
	}
	
}
