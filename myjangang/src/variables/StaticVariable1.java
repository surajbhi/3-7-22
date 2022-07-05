package variables;

public class StaticVariable1 {
	static int a=38;
	static int b;
	static String tr;
	static boolean iy;
 
	public static void show()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(tr);
		System.out.println(iy);
	}
	public void display()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		show();
		StaticVariable1 n = new StaticVariable1();
		n.display();
		show();
				
				
				
				
				


	}

}
