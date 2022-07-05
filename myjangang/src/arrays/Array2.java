package arrays;

public class Array2 {

	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;// trying to initialize 3rd index value

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);// runtime exception
		}
	}

}
