package abstracting;

public class Car extends Fuel // abstract class extended using extends keyword-concrete class
{

	public void petrol() {
		System.out.println("Car petrol is filled inside the car");
	}

	public static void main(String[] args) {
		Car c = new Car(); // 1st way to call
		c.petrol();
		c.ready();
		c.stop(); // we can inherit static method also

		Fuel f = new Car(); // 2nd way to call //we provide the reference variable of that abstract class
		f.petrol();
		f.ready();
		f.stop(); //// we can inherit static method also

	}

}
//}
