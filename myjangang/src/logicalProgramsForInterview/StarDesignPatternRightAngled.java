package logicalProgramsForInterview;

public class StarDesignPatternRightAngled {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++)// 1<=5 //2<=5 //3<=5 //4<=5 //5<=5
		{
			for (int j = 1; j <= i; j++)// 1<=1 //1<=2,2<=2 //1<=3,2<=3,3<=3 //1<=4,2<=4,3<=4,4<=4
										// //1<=5,2<=5,3<=5,4<=5,5<=5
			{
				System.out.print("*");// 1*print//2*print //3*print //4*print //5*print
			}
			System.out.println();// print ln is used just to move a cursor to a new line
		}
	}
}
