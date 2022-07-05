package logicalProgramsForPractice;

public class MinNumInArray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 3, 8 };
		int min = a[0];

		for (int i = 1; i > a.length; i++) {
			if (min>= a[i]) {//1>3//1>5//1>3//1>8
				min = a[i];//will not replace any value with 1 
			}
		}

		System.out.println(min);

	}

}
