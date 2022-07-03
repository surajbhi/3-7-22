package logicalProgramsForInterview;

public class ReverseANumber {

	public static void main(String[] args) {
		int num = 432;
		int temp;
		int rev = 0;

		while (num > 0) // 432>0 //43>0 //4>0
		{
			temp = num % 10; // 432%10=2 //43%10=3 //4%10=4
			rev = rev * 10 + temp;// 0*10+2=2 //2*10+4=24//24*10+1=241
			num = num / 10; // 432/10=43//43/10=4//4/10=
		}
		System.out.println(rev);
	}

}
