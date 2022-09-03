package pkg1;

public class assignment2 

{
	public int sum(int a, int b)
	{
	int c;
	c=a+b;
	System.out.println("The sum result is "+c);
	return c;
	}
	
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("The sub result is "+z);
		return z;
	}
	
	public int multi(int a1, int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("The multi Result is "+a3);
		return a3;
	}
	
	public int div(int x2, int y2)
	{
		int z2;
		z2=x2/y2;
		System.out.println("The div result is "+z2);
		return z2;
	}
	
	public static void main(String[] args) 
	
	{
		//((((10+2)+2)-2)*2)/2)
		assignment2 obj=new assignment2();
		int sumResult=obj.sum(10, 2);
		int sumResult2=obj.sum(sumResult, 2);
		int subResult=obj.sub(sumResult2, 2);
		int multiResult=obj.multi(subResult, 2);
		int divResult=obj.div(multiResult, 2);
		System.out.println("The final result is "+divResult);
		System.out.println();
		
		//((((10-2)+2)*2)/2)
		int subResult3=obj.sub(10, 2);
		int sumResult3=obj.sum(subResult3, 2);
		int multiResult3=obj.multi(sumResult3, 2);
		int divResult3=obj.div(multiResult3, 2);
		System.out.println("The final result is "+divResult3);
		System.out.println();
		
		//((((10*2)-2)+2)-2)/2)
		
		//((((10+2)+2)*2)-2)/2)
	
	}
}
