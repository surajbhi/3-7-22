package constructors;

public class ConstructorEx2 {
	int a;// declaration
	int b;

	ConstructorEx2() {
		System.out.println("now we are initializing the variable");
		a = 10;
		b = 40;
		System.out.println(a + "  " + b);
	}

	public static void main(String[] args) {
		ConstructorEx2 c = new ConstructorEx2();
	}

}
