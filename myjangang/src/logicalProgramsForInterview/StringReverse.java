package logicalProgramsForInterview;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Nayan";//length =16//String a[]=new String[];
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {//15>=0//14>0//13>0
			rev = rev + str.charAt(i);//''+j//j+a//j+a+r
			
		}
		System.out.println(rev);
		if(str.equals(rev)|str.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindrome");
}
		else
		{
			System.out.println("String is not palindrome");

		}
	}

}
