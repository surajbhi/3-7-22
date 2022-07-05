package logicalProgramsForPractice;

public class SecondHighestInArray {

	public static void main(String[] args) {
		int a[] = { 1, 8, 3, 7, 8, 9, 5, 5, };

		int temp;

		for (int i = 0; i < a.length; i++)// 1<8
		{
			for (int j = i + 1; j < a.length; j++)// 6<8
			{
				if (a[i] < a[j])// 8<3,8<7,8<8,8<9
				{
					temp = a[i];// 8
					a[i] = a[j];// 9
					a[j] = temp;// 8
				}
			}
			System.out.print(" " + a[i]);

		}
		System.out.println();

		System.out.println("Second Max number " + a[1]);

	}

}
