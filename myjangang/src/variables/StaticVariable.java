package variables;

public class StaticVariable {
	static int m = 100;
	static int n = 10;

	public void addition() {
		int o = m + n;
		System.out.println(m);
		System.out.println(o);
	}

	public static void division() {
		int p = m / n;
		System.out.println(n);
		System.out.println(p);
	}

	public static void main(String[] args) {
		StaticVariable b = new StaticVariable();
		b.addition();
		division();
	}

}
