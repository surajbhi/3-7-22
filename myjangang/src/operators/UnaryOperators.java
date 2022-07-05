package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// postfix (incrementing)
		int a = 10;
		System.out.println(a); // 10
		System.out.println(a++); // 10
		System.out.println(a); // 11

//postfix (decrementing)
		int b = 10;
		System.out.println(b); // 10
		System.out.println(b--); // 10
		System.out.println(b); // 9

//prefix(incrementing)
		int c = 10;
		System.out.println(c); // 10
		System.out.println(++c); // 11
		System.out.println(c); // 11

//prefix(decrementing)
		int d = 10;
		System.out.println(d); // 10
		System.out.println(--d); // 9
		System.out.println(d); // 9
	}
}
