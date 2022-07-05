package abstracting;

public class Peter {
	public void toGoAirportByCar() {
		System.out.println("peter will use car to reach airport");
		Car c = new Car();// by using first way
		c.petrol();
		c.ready();
	}

	public void flyInAeroplane() {
		System.out.println("now peter will fly in aeroplane to uk");
		Fuel f = new Aeroplane();// by using second way
		f.petrol();
		f.ready();
	}

}
