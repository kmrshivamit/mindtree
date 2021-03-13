package march10th2021;

/*Write a program to read 2D array as input which contains only unique elements, then replace max
element’s position with min element’s position.
Input :
1 2 3
4 5 6
7 8 9
Output :
9 2 3
4 5 6
7 8 1*/

//take 2d array from user.
//initialise min as highest integer value and max is smallest Integer  value
//traverse the array and find min and max 
//put the min and max at respective position


import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = 2147483647;
		int max = -2147483648;
		System.out.println("Enter number of rows in matrix");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns in matrix");
		int cols = scanner.nextInt();

		int matrix[][] = new int[rows][cols];
		System.out.println("Enter the elements of matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scanner.nextInt();
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					}
				if (matrix[i][j] > max)
					max = matrix[i][j];
			}
		}		
	
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == max) {
					matrix[i][j] = min;
					continue;}
				if (matrix[i][j] == min)
					matrix[i][j] = max;
				
			}
			System.out.println();
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
