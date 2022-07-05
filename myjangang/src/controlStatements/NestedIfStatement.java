package controlStatements;

public class NestedIfStatement {

	public static void main(String[] args) {
		System.out.println("welcome Blood donation camp");
		int age = 14;
		int weight = 35;
		if (age >= 18)
			;
		{
			System.out.println("condition 1 is satisfied");
			if (weight > 45)
				;
			{
				System.out.println("condition 2 is satisfied");
				System.out.println("you are eligible to donate blood");
			}
		}

		{

			System.out.println("your age is not valid to donate blood");
		}
	}

}
