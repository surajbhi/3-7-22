package interfac;

public interface Tubelight {
	public  void tubelightInHall();
	//variables declare inside interface are by default-public static and final
 public int a=1;//extra
 static long b=1;//extra
 final short c=2;//extra
 
	void tubelightinKitchen();
	
	//Tubelight();{  }     //interface cannot have constructor
	
	public static void tubelightInHell() { } // we can declare static method inside interface
	//but it definition should be complete;

}
