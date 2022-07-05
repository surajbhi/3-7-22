package variables;

public class Variable_Local {
	public void localVariable()
	{
	int i=45;
	System.out.println(i);
}
	public static void local1()
	{
		int i=50;
		System.out.println(i);
	}
	
	public static void main(String[] args) 
	{
		Variable_Local obj=new Variable_Local();
		obj.localVariable();
		local1();
	}

}
