package pkg1;

public class FirstApproch 
{
	int a,b,c,d,e;
	public static void main(String[] args) 
	{
		FirstApproch obj1=new FirstApproch();
		obj1.a=12; //first call
		obj1.b=312; //second call
		obj1.c=23; //third call
		obj1.d=45; //fourth call
		obj1.e=43; //fifth call
		System.out.println(obj1.a); //sixth call
		System.out.println(obj1.b); //seventh call
		System.out.println(obj1.c); //eighth call
		System.out.println(obj1.d); //ninth call
		System.out.println(obj1.e); //tenth call
		System.out.println();
		
		
		FirstApproch obj2=new FirstApproch();
		obj2.a=12; //first call
		obj2.b=312; //second call
		obj2.c=23; //third call
		obj2.d=45; //fourth call
		obj2.e=43; //fifth call
		System.out.println(obj2.a); //sixth call
		System.out.println(obj2.b); //seventh call
		System.out.println(obj2.c); //eighth call
		System.out.println(obj2.d); //ninth call
		System.out.println(obj2.e); //tenth call
		
		
	}

}
