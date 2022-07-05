package upcasting;

public class UpcastingConcept2 {

	public static void main(String[] args) {
		Father f = new Son();
		f.home();
		f.farm();
		
		
		System.out.println(f.age);

	}

}
