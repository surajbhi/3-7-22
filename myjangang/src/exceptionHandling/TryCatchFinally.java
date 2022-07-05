package exceptionHandling;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
		} catch (Exception e) // parent class
		{
			e.printStackTrace(); // printing statement
		} finally {
			System.out.println("Execution completed");// will print anyway no matter exception is there or not
		}
		System.out.println("ngaha");
		System.out.println("ngaha");
		System.out.println("ngaha");
		System.out.println("ngaha");
	}
}
