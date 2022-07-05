package variables;

public class GlobalVariable1 {
	Float F = 89.56F;

	public static void test1() {
		// System.out.println(F);
	}

	public void test() {
		System.out.println(F);
	}

	public static void main(String[] args) {
		GlobalVariable1 m = new GlobalVariable1();
		m.test();
		m.test1();
		m.test1();
		m.test();
		m.test1();

	}

}
