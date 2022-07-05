package upcasting;

public class UpcastingConcept1 {

	public static void main(String[] args) {
		Animals a = new Shark();
		a.nature();
		System.out.println(a.name);
	}
}
