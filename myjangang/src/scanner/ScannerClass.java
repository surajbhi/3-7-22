package scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your first number");
		int a = s1.nextInt();

		System.out.println("Enter your second number");
		int b = s1.nextInt();

		int c = a + b;
		System.out.println("Answer is = " + c);
	}
}
