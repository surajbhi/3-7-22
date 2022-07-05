package abstracting;

public abstract class Fuel { // abstract class declared with abstract keyword.
	public int a = 1;// //variables in abstract can be final,non-final,static,non-static.
	static long b = 1;// extra
	long d = 1;       // extra
	final short c = 2;// extra

	 Fuel() { // abstract class can have constructors. public,private,protected allowed
		float f = 2.3F;
	}

	abstract void petrol();// incomplete method<-->abstract method 

	public void ready() // complete method <--->Non abstract method---non static method
	{
		System.out.println("ready to go");
	}
	// Fuel f=new Fuel();//cannot create object

	public static void stop() { // static method can be declare in abstract clas
								// complete method <--->Non abstract method
	}

}
