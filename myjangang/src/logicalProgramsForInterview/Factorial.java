package logicalProgramsForInterview;

public class Factorial {
	public static void main(String[] args) {
		int a = 5;
		int fact = 1;
		for (int i = 1; i <= a; i++) // 1<=5,2<=5,3<=5,4<=5,5<=5
		{
			fact = fact * i; // 1*1 ,1*2 ,2*3 ,6*4 ,24*5
		}
		System.out.println(fact);
	}
}
