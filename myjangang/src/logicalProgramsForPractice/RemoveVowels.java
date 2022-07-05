package logicalProgramsForPractice;

public class RemoveVowels {

	public static void main(String[] args) {
		String str1="shilpa";
		String str="";
		for(int i=0;i<str1.length();i++)
		{
		if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
		{
		System.out.print("");
		}
		else
		{
		str=str+str1.charAt(i);
		}
		}
		System.out.println(str);
		}
	

}
