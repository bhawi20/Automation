package pkg1;

public class ThisKeywordM 
{
	public void m1()
	{
		System.out.println("method 1");
	}
	
	public void m2()
	{
		this.m1();
		System.out.println("method 2");
		this .m3(44,66);
	}
	
	public void m3(int a, int b)
	{
		System.out.println("method 3");
	
	}
	
	public static void main(String[] args) 
	{
		ThisKeywordM obj= new ThisKeywordM();
		obj.m2(); //Calling method m2
		
	}
	

}
