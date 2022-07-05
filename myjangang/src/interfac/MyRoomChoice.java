package interfac;

public class MyRoomChoice {

	public static void main(String[] args) {
//testing my light sensors
		System.out.println("I am entering hall");
		Hall h = new Hall();
		h.tubelightInHall();
		h.tubelightinKitchen();

		System.out.println("I am enetring kitchen");
		Tubelight t = new Kitchen();
		t.tubelightInHall();
		t.tubelightinKitchen();
	}
	

}
