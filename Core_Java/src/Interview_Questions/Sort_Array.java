package Interview_Questions;

public class Sort_Array {

	public static void main(String[] args) {

		
		int arr[] = {1,3,6,2,4,9,5};
		int temp;
		
		for(int i=0;i<6;i++)
		{
			for(int j=i+1;j<6;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<6;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
