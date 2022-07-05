package logicalProgramsForPractice;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		String str = "j!a@v#8$a%9";

		String plainstr = str.replaceAll("[^a-zA-Z]", "");
		System.out.print(plainstr);

	}

}
