package conversion;

public class ExplicitCasting {

	public static void main(String[] args) {
		int i = 100000;
		short b = (short) i;
		System.out.println(b);

		float a = 57.99f;
		short s = (short) a;
		System.out.println(s);

		double d = 454545454;
		float f = (float) d;
		System.out.println(f);

	}

}
