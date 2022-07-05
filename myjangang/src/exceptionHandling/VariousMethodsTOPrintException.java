package exceptionHandling;

public class VariousMethodsTOPrintException {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
		} catch (Exception e) // parent class
		{
			e.printStackTrace(); // best and most preferred way to print exception`
			// Exception Name
			// Description
			// StackTrace
			System.out.println("===============");

			System.out.println(e);
			// Exception Name
			// Description

			System.out.println("===============");
			System.out.println(e.getMessage());
			// description
		}
	}
}
