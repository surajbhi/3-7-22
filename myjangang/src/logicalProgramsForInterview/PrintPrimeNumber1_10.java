package logicalProgramsForInterview;

public class PrintPrimeNumber1_10 {
	public static void main(String[] args) {
		int flag = 0;
		for (int i = 2; i <= 10; i++)// 2<=10(t)//3<=10(t)//4<=10(t)//5<=10(t)//6<=10(t)//7<=10(t)
		{ // ?
			for (int j = 2; j < i; j++)// 2<2(f) //2<3(t) //2<4(t) //2<5(t) //2<6(t) //2<7(t)
			{
				if (i % j == 0) // no //3%2==1(f)//4%2==0(t)//5%2==t(f)//6%2==0(t)//7%2==0(t)
				{
					flag = 1; // no //no //yes //no //yes //no
				}
			}
			if (flag == 0) {
				System.out.println(i + "= number is prime no");// 2//3//5//7
			} else {
				flag = 0;
			}
		}
	}

}
