package multiplteInheritance;

public class ColdCoffee implements Milk, Sugar, Coffee, ChocoPowder {
	public static void main(String[] args) {
		ColdCoffee c = new ColdCoffee();
		c.addMilk();
		c.addSugar();
		c.addChocoPowder();
		c.addCoffee();
	}

	public void addChocoPowder() {
		System.out.println("now add chocolate powder in it");
	}

	public void addCoffee() {
		System.out.println("now add coffee in the milk & mix it");
		System.out.println("now add chocolate powder in the milk");

	}

	public void addSugar() {
		System.out.println("Now add sugar in it");
	}

	public void addMilk() {
		System.out.println("First take a milk in glass");
	}
}
