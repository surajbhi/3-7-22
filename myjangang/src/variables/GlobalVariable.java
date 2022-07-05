package variables;

// write a program for gloabal variable with refrence of static method
public class GlobalVariable {
	Float F = 89.56F;

	public static void test1() {
		// System.out.println(F);
	}

	public void test() {
		System.out.println(F);
	}

	public static void main(String[] args) {
		GlobalVariable n = new GlobalVariable();
		n.test1();
		test1();
	}

}
