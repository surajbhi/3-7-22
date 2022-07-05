package logicalProgramsForPractice;
//can we overload the main method?
//can we override main method?
public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("main mthod 1");
		main("suraj");
		main(1);
		main(1, 2);
	}

	public static void main(String args) {
		System.out.println("main mthod 2");
	}

	public static void main(int a) {
		System.out.println("main mthod 3");
	}

	public static void main(int a, int b) {
		System.out.println("main mthod 4");
	}

}
