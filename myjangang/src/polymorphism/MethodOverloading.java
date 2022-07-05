package polymorphism;

public class MethodOverloading {
	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void multiply(int d, int e, int c) {
		System.out.println(d * e * c);
	}

	public void multiply(double d, int e, int c) {
		System.out.println(d * e * c);
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.multiply(2, 4);
		m.multiply(2, 3, 4);
		m.multiply(4.0, 5, 6);
	}

}
