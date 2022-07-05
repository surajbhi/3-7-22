package logicalProgramsForInterview;

public class FrequencyOfAlphabets {

	public static void main(String[] args) {
		int counter = 0;
		String str = "I love my countryyyyy";// 21
		
		char y = 'y';
		for (int i = 0; i <= str.length() - 1; i++) {// 0;0<=20;//1;//2
			if (y == str.charAt(i)) { // o==e//
				counter++;

			}

		}
		 System.out.println("Frequency of " + y + " = " + counter);
	}

}
