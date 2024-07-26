package Interview_Questions;

public class Matrix_Cisco {

	public static void main(String[] args) {

		
/*Problem statement: 1.Find minimum number from matrix
 *                   2.Find minimum number column
 *                   3.Find maximum number in that column. */		
		int arr[] [] = {{2,3,5},
				        {4,7,9},
				        {8,1,3}};
		int min_num=arr[0][0];
		int col_num=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(min_num>arr[i][j])
				{
					min_num=arr[i][j];
					col_num=j;
					
				}
			}
		}
		
		int max_num=arr[0][col_num];
		
		int k=0;
		while(k<3)
		{
			if(max_num<arr[k][col_num])
			{
				max_num=arr[k][col_num];
			}
			k++;
		}
		
		
		System.out.println("minimum number from matrix is: "+min_num);
		System.out.println("column number of selected matrix: "+ col_num);
		System.out.println("maximum number from the selected column: "+max_num);
		
		
	}

}
