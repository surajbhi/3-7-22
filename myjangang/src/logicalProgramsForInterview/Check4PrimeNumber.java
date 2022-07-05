package logicalProgramsForInterview;

public class Check4PrimeNumber {

	public static void main(String[] args) {
		int a = 4;
		int temp = 0; // we dont take i=1 because we know prime no are always divisible by 1 & itself
						// (line no 8)
		for (int i = 2; i <= a - 1; i++)// 2<=3...3<=2 //
		{
			if (a % i == 0) // 3%2 not =0
			{
				temp = 2;
			}
		}
		if (temp == 0) {
			System.out.println(a + " =it is a prime number");
		} else {
			System.out.println(a + " = is not a prime number");

		}
	}
}
