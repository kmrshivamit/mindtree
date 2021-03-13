package ProjectManagement;
import java.util.Scanner;

//Enter the row size of matrix
//Enter the column size of matrix
//Display sum of elements row wise
//Display largest sum among them

public class Question1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int rowsize = s.nextInt();
		int arr[][]=new int[rowsize][rowsize];
		
		for(int i=0;i<rowsize;i++)
		{
			for( int j=0;j<rowsize;j++)
			{  System.out.println("Enter the element");
			
				arr[i][j]=s.nextInt();
			}
		}
		int max=0;
		for(int i=0;i<rowsize;i++)
		{
			int sum=0;
			for(int j=0;j<rowsize;j++)
			{
				sum+=arr[i][j];
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			System.out.println("Sum of element in " +i+" th row is"+ sum);
			if(max<sum)
				max=sum;
		}
		System.out.println(" Maximum sum is "+max);

	}

}
