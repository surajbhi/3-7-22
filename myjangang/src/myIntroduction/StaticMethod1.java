package myIntroduction;

public class StaticMethod1 {
	public static void myFunctionA() {
		System.out.println("Im inside static method A...Hello");
	}

	public static void myFunctionB() {
		System.out.println("Im inside static method B...bye");
		System.out.println("Im inside static method B...good bye");
		System.out.println("Im inside static method B...see you soon");
		System.out.println("Im inside static method B...catch you soon");
	}

	public static void myFunctionC() {
		System.out.println("Im inside staic method C..... good morning");
	}

	public static void main(String[] args)

	{
		myFunctionA();
		myFunctionC();
		myFunctionB();
	}
}
