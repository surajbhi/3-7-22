package operators;

public class ShiftOperator {

	public static void main(String[] args) {
//left shift operator

		int a = 10;
		System.out.println(a << 3); // 10*2^3 ----->>> 80
		System.out.println(a << 4); // 10*2^4 ----->>>160

		// right shift operator
		int b = 10;
		System.out.println(b >> 3); // 10/2^3
		System.out.println(b >> 2); // 10/2^2

	}

}
