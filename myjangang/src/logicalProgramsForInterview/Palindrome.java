package logicalProgramsForInterview;

//a pallindrome number is a number that remains the same when its digits are reversed
public class Palindrome {
	public static void main(String[] args) {
		int num = 121;
		int temp;
		int rev = 0;
		int pal = num;
		while (num > 0) // 121>0(t) //12>0(t) //1>0
		{
			temp = num % 10; // 121%10=1 //12%10=2 //1%10=1
			rev = rev * 10 + temp;// 0*10+1=1 //1*10+2=12//12*10+1=121
			num = num / 10; // 121/10=12//12/10=1 //1/10=1
		}
		System.out.println("rev");// 121
		if (rev == pal) // 121=121
		{
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrome");
		}
	}
}
