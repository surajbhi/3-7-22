package controlStatements;

public class IfElseIf {

	public static void main(String[] args) {
		int money = 101;
		if (money > 3000 && money <= 10000) {
			System.out.println("I will buy a smartphone");

		} else if (money > 10000 && money <= 30000) {
			System.out.println("i will buy a bicycle");
		} else if (money > 30000 && money <= 100000) {
			System.out.println("i will buy a laptop");
		} else {
			System.out.println("insufficient money");
		}
	}

}
