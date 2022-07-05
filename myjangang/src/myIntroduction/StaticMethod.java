package myIntroduction;

public class StaticMethod {
	public static void myMethod() {
		System.out.println("Im inside static method");
	}

	public static void main(String[]args)
	{
		//StaticMethod.myMethod(); // way 1
		myMethod(); // way 2
	}

}
