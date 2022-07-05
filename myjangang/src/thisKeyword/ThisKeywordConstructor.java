package thisKeyword;

public class ThisKeywordConstructor {
	ThisKeywordConstructor() {
		System.out.println("Non paramterized constructor");
	}

	ThisKeywordConstructor(int a) {
		this();
		System.out.println("paramterized constructor");
	}

	public static void main(String[] args) {
		// new ThisKeywordConstructor(88);//way 1
		ThisKeywordConstructor tk = new ThisKeywordConstructor(88); //way 2
	}
}
