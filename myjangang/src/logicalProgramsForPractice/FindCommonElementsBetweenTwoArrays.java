package logicalProgramsForPractice;

public class FindCommonElementsBetweenTwoArrays {

	public static void main(String[] args) {
int arr1[]= {8,15,6,21,25,20};
int arr2[]= {3,8,9,6,15,21};
for(int i=0;i<arr1.length;i++)
{
	for(int j=0;j<arr2.length;j++)
	{
		if(arr1[i]==arr2[j])
		{
		System.out.println(arr1[i]);	
		}
	}
	
}

	}

}
