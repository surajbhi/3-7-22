package interfac;

public class ZMyHoyspotChoice {

	public static void main(String[] args) {
		System.out.println("I am using mobile");

		ZMobile m = new ZMobile();
		m.HotspotInMobile();
		m.HotsPotInLaptop();
		System.out.println("----------------------------");

		System.out.println("I am using laptop");

		ZLaptop l = new ZLaptop();
		l.HotsPotInLaptop();
		l.HotspotInMobile();
	}

}
