package logicalProgramsForInterview;

public class ArmstrongNumber {// a no that is equal to the sum of cubes of its digits

	public static void main(String[] args) {
		int num = 1634;
		int temp = 0;
		int rev = 0;
		int arms = num;

		while (num > 0) // 1636>0 //163>0 //16>0
		{
			temp = num % 10; // 1636%10=6 //163%10=3 //16%10=6//1%10=1
			rev = rev + temp * temp * temp * temp;// 0+6*6*6*6=1296 //216+3*3*3*3=297=243//243+6*6*6=459//459+1=1636
			num = num / 10; // 1636/10=163 //163/10= //16/10=1//1/10=0
		}
		// System.out.println(rev);
		if (arms == rev) {
			System.out.println(arms + " is a Armstrong number");
		} else {
			System.out.println(arms + " is Not Armstrong number");

		}
	}
}
