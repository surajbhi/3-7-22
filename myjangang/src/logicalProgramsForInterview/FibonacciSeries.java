package logicalProgramsForInterview;

//A series of numbers in which each number is the aadn of previous consecutive 2 no.
public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("print Fibonacci series between 1 to 20");
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b);
		while (c < 20) {
			c = a + b; // c=(0+1)=1//(1+1)=2//(1+2)=3//(2+3)=5//(3+5)=8//(8+5)=13//(8+13)=21
			a = b; // a=1 //a=1 //a=2 //a=3 //a=5 //a=8 //a=13
			b = c; // b=1 //b=2 //b=3 //b=5 //b=8 //b=13 //b=21
			System.out.print(" " + c);// 1//2//3//5//8//13//21
		}
	}

}
