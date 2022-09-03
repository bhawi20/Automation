package pkg1;

public class student
{
	int age;
	int rollno;
	
	public void Display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void Display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args)
	{
		student abc=new student();
		abc.age=32;
		abc.rollno=6;	
		System.out.println("Age of student is " +abc.age);
		System.out.println("Rollno of student is " +abc.rollno);
		abc.Display1();
		abc.Display2();
	}

}
