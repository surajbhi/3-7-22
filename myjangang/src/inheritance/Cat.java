package inheritance;

public class Cat extends Animals {
	public void sound() {
		System.out.println("Meow-Meow");

	}

	public static void main(String[] args) {
		Cat c = new Cat();
		c.eats();
		c.drink();
		c.sound();

	}

}
