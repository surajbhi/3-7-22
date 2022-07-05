package polymorphism;

public class Icecream extends Panipuri {
	Icecream(int q) {
		super(q);    //super keyword use to refer parent class object,it can be used to invoke parent class method
	}

	public void eat(int a,short b) {
		System.out.println("I want to eat Icecream");

	}

	public static void main(String[] args) {
		Icecream i = new Icecream(1);
		i.eat(1, 2);
		Panipuri p = new Panipuri(1);
		p.eat(3, 4);
		
	}

}
