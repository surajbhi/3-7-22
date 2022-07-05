package myIntroduction;

//MAKING METHOD CALL WITH ARGUMENTS WITHIN SAME CLASS
public class MCAWC {
	public void mobile() {
		System.out.println("I have a mobile");
	}

	public void computer(int a) {
		System.out.println("I have a computer");
	}

	public void laptop(String a) {
		System.out.println("I have a laptop");
	}

	public static void main(String... args) {
		MCAWC obj = new MCAWC();
		obj.mobile();
		obj.computer(00);
		obj.laptop(null);
	}
}
