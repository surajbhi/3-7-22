package thisKeyword;

public class UsingThisKeyword {
	int a;// global /instance variable

	public void myMethod(int a) // local variable
	{
		this.a = a;
		System.out.println("Local variable a is =" + a);
		System.out.println("Local variable a is =" + a);

	}

	public void display() {
		System.out.println("Global variable a is=" + a);
	}

	public static void main(String[] args) {
		UsingThisKeyword n = new UsingThisKeyword();
		n.myMethod(99);
		n.display();
	}

}
