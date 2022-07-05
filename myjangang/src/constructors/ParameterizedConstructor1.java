package constructors;

public class ParameterizedConstructor1 {
	/*
	 * No of arguments should be diffrent Type of argument should be diffrent
	 * Sequence of argument should be diffrent
	 *
	 *
	 * constructor overloading is possible as multiple constructors are declared
	 * inside same class
	 *
	 */
	ParameterizedConstructor1() {
		System.out.println("zero argument constructor");
	}

	ParameterizedConstructor1(int a) {
		System.out.println("int argument constructor");

	}

	ParameterizedConstructor1(int a, short s) {
		System.out.println("int,short argument consrructor");

	}

	ParameterizedConstructor1(short s, int a) {
		System.out.println("short,int argument constructor");

	}

	ParameterizedConstructor1(int a, int b) {
		System.out.println("int,int argument constructor");

	}

	ParameterizedConstructor1(string)
	{
		System.out.println("string argument consructor");
	
	}

	ParameterizedConstructor(double z, string y) {
		System.out.println("double,string argument construcor");

	}

	ParameterizedConstructor(float x, string w) {
		System.out.println("float,string argument constructor");

	}

	public static void main(String[] args) {
		new ParameterizedConstructor1(1);
		new ParameterizedConstructor1(99.90f, xyz);
		new ParameterizedConstructor1();
		new ParameterizedConstructor1();
	}

}
