package logicalProgramsForPractice;

public class B extends ClassA {
	int i = 20;

	void show(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}

	public static void main(String[] args) {
		B ob = new B();
		ob.show(30);

	}

}
