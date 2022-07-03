package logicalProgramsForPractice;

public class AcendingArray {

	public static void main(String[] args) {
int a[]= {10,9,2,3,6,8};
		
		for(int i=0;i<a.length;i++)//0<6
		{
			for(int j=(i+1);j<a.length;j++)//1<6
			{
				if(a[i]>a[j])
				{
					 int temp = a[i];
					 a[i]=a[j];
					 a[j]=temp;
					
				}
			}
			System.out.println(" "+a[i]);
	}

	}
}
