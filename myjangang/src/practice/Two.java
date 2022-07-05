package practice;

public class Two {   //to avoid big class name
	static int a=10;  // because i accesed it in static method so static keyword 
	 static int b=20; // same as above
	int c=b-a;
	static int d=a+b; // same here
	static int e=b/a; // same here
	int f=a*b;
	public  void abc()   // non static
	{
		System.out.println(c); //subtraction
	}
public static void def()   // static
{
	System.out.println(d); //addition
}
public static void g()       //static
{
	System.out.println(e); //division
}
public void h(int y)          // making method call with arguments within same class
{
	System.out.println(f); //multiplication
}
public static void main (String[]args)
{
	Two m=new Two();
	m.abc();
	def();
	g();
	Two p=new Two();
	p.h(22);
}
}

