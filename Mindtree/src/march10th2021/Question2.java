
/*Write a program which takes an array of numbers from user and then sort those numbers using
insertion sort and take out prime numbers if it’s there in array.
Note : The prime numbers in subset should also be in sorted manner.
Input: {9,2,89,7,15}
Output: {2,7,9,15,89}
Prime sorted subset array : {2,7,89}*/

/*
Algorithm
1. take input array from user
2. write code for insertion sort
3. write code for prime numbers
4 sort the array.
6 for each element in the sorted array check if it is prime or not and store it into another array

*/
package march10th2021;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		insertionSort(arr);
		// ans array is to get prime numbers from sorted array
		int ans[] = new int[n];
		int i = 0;// it will be used to get maximum number of elements in ans array

		for (int j = 0; j < arr.length; j++) {
			if (isPrime(arr[j]))
				ans[i++] = arr[j];
		}

		for (int j = 0; j < i; j++)
			System.out.println(ans[j]);
	}

	static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int elementToBeInserted = arr[i];

			int j = i - 1;

			while (j >= 0 && arr[j] >= elementToBeInserted) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = elementToBeInserted;
		}
	}

	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
