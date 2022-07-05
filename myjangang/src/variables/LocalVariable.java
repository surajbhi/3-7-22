package variables;

public class LocalVariable {
	public void mymethod()
	{
		int b;
		int a=10;//local variable
		System.out.println(a);
		//int a=12;   //duplicates are not allowed
		//int b;
		System.out.println(b);}    //it does not have any defalt value in java
	//System.out.println(a);      //local variable cannot be accesed outside the scope.
public static void main(String[]args)
{
	LocalVariable obj= new LocalVariable();
	obj.mymethod();

	System.out.println(c);       // local variable cannot be accesed outside the scope
	
	
}
}
