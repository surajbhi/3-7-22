package logicalProgramsForPractice;

public class Demo {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int temp;
		for(int i=0;i<a.length;i++) //0<5
		{
			for(int j=i+1;j<a.length;j++)//1<5
			{
				if(a[i]<a[j])//
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}

}
