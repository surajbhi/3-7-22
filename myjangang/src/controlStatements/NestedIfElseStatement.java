package controlStatements;

public class NestedIfElseStatement {

	public static void main(String[] args) {
		System.out.println("odd,even or negative");
		int a = 7;
		if (a > 0) {
			System.out.println("yes number is positive");
			if (a % 2 == 0) {
				System.out.println("yes no is an even no");
			} else {
				System.out.println("no is odd");
			}
		} else {
			System.out.println("it is a negative no");
		}
	}

}
