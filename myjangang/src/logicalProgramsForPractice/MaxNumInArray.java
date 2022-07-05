package logicalProgramsForPractice;

import java.util.Scanner;

public class MaxNumInArray {
Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = { 8, 0, 7, 5, 4, 2, 1, 9 };
		int max = a[0];// considering 0 index no as max

		for (int i = 1; i < a.length; i++)// for traversing an array
		{

			if (max <= a[i])// 8<0//8<7//8<5//8<4//8<2//8<1//8<9//now it will compare all values with 9
			{
				max = a[i];//replaces 8 with 9
			}
		}

		System.out.println(max);

	}

}
