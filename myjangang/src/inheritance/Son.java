package inheritance;

//single level inheritance
public class Son extends Father {
	public void job() {
		System.out.println("son has job");
		a++;
	}

	public void bike() {
		System.out.println("son has bike");

	}

	public static void main(String[] args) {
		Son s = new Son();
		s.job();
		s.bike();
		s.house();
		s.farm();

	}

}
