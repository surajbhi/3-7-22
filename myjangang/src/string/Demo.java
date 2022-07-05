package string;

public class Demo {

	public static void main(String[] args) {
		String s1 = "SUraj bhirde";
		String s2 = "suraj bhirde";
		String s3 = "Automation tester";

		char c = s1.charAt(3);
		System.out.println(c);

		boolean s = s1.endsWith("irde");
		System.out.println(s);

		System.out.println(s1.startsWith("Ur"));
		System.out.println(s1.equalsIgnoreCase(s1));
		System.out.println(s1.length());// length starts with 1
		System.out.println(s1.isEmpty());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf('r'));
		System.out.println(s1.lastIndexOf('r'));
		System.out.println(s1.concat(s3));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		System.out.println(s1.replace("SUraj", "raja bhaiyya"));
		
	}
}
