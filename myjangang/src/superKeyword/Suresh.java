package superKeyword;

public class Suresh extends Ramesh{
int height = 5;
	
	public void showHeight()
	{
		System.out.println(super.height);
		System.out.println(height);
	}

	public static void main(String[] args) {
		Suresh s = new Suresh();
		s.showHeight();

	}

}


