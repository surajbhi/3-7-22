package thisKeyword;

public class WithoutUsingThisKeyword {
	int a;// global variable

	public void myMethod(int f) { // local variable
		System.out.println(f);
		a = f;
	}

	public void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		WithoutUsingThisKeyword n = new WithoutUsingThisKeyword();
		n.myMethod(99);
		n.display();
	}

}
