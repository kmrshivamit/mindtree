/*sudo code
1 Take the two inputs array.
2 Take a temp array to store results after substraction
3 Take a result array to store the negative results.
4 print it as output.

*/

package march10th2021;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int array1[] = new int[size];
		int array2[] = new int[size];

		System.out.println("Enter the elements of 1st array");

		for (int i = 0; i < size; i++) {
			array1[i] = scanner.nextInt();
		}

		System.out.println("Enter the elements of 2nd array");

		for (int i = 0; i < size; i++) {
			array2[i] = scanner.nextInt();
		}

		int temp[] = new int[size];

		for (int i = 0; i < size; i++)
			temp[i] = array2[i] - array1[i];

		int result[] = new int[size];
		int resultArraySize = 0;
		for (int i = 0; i < size; i++) {
			if (temp[i] < 0)
				result[resultArraySize++] = temp[i];

		}

		System.out.println("The result is given below");
		for (int i = 0; i < resultArraySize; i++) {
			System.out.println(result[i]);
		}

	}
}
