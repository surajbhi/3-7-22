package logicalProgramsForPractice;

public class PrintVowelsOnly {

	public static void main(String[] args) {
		String str1 = "shilpa";

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' 
					|| str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
				System.out.print(str1.charAt(i));

			}

		}
	}

}
