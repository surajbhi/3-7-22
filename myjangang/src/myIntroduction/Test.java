package myIntroduction;

public class Test {
	public void myMethod() {
		System.out.println("Im inside non static method");
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.myMethod();

	}
}
