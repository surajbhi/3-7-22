package logicalProgramsForInterview;

public class WithoutLoopPrint1to10 {
	public void myMethod(int a) // non static method
	{
		if (a <= 10) {
			System.out.println(a);// 1//2 //3 //4 //5 //6 //7 //8 //9 //10
			myMethod(a + 1); // (1+1)//(2+1)//(3+1)//(4+1)//(5+1)//(6+1)//(7+1)//(8+1)//(9+1)
		}
	}

	public static void main(String[] args) {
		WithoutLoopPrint1to10 m = new WithoutLoopPrint1to10(); // object creation
		m.myMethod(1); // method calling
	}

}
