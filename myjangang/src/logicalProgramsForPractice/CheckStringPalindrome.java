package logicalProgramsForPractice;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		String str="nayan";
		String rev = "";
		int length = str.length();
		for ( int i = length - 1; i >= 0; i-- )
			rev = rev + str.charAt(i);
		if (str.equals(str))
		System.out.println("Entered string is a palindrome.");
		else
		System.out.println("Entered string is not a palindrome.");
	}

}
