package logicalProgramsForInterview;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before swapping " + a + "----" + b);
		a = a + b;// 30
		b = a - b;// 30-20=10
		a = a - b;// 30-10=20
		System.out.println("after swapping " + a + "----" + b);

	}

}
