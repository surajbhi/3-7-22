package logicalProgramsForPractice;

public class InstanceBlock {
	InstanceBlock() {
		System.out.println("my name is suraj bhirde");

	}
	 int a=1; static int b=1;
	{// instance block
		// execute only at the time of object creation
		// no any keyword reqd
		// can access both static as well as non static variables
		System.out.println("my name is suraj");
		System.out.println(a+" "+b);

	}

	public static void main(String[] args) {
		InstanceBlock IB = new InstanceBlock();
	}

}
