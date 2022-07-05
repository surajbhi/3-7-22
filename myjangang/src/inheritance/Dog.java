package inheritance;

public class Dog extends Animals {
	public void sound() {
		System.out.println("bow bow");

	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eats();
		d.drink();
		d.sound();

	}

}
