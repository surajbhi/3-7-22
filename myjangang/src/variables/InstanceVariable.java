package variables;

public class InstanceVariable {
	boolean atr;
	int b;
	String abc;
	int a = 25; // instance

	public static void show() {
		System.out.println(b);
	}

	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(abc);
		System.out.println(atr);
	}

	public static void main(String... args) {
		InstanceVariable obj = new InstanceVariable();
		obj.display();

	}
}
