package myIntroduction;

//Making method call within same class
public class MCWC {
	public static void fun1() {
		System.out.println("Im in static method fun1");
	}

	public void fun2() {
		System.out.println("Im in non static method fun2");
	}

	public static void main(String[] args) {
		MCWC.fun1();
		MCWC obj = new MCWC();
		obj.fun2();
	}

}
