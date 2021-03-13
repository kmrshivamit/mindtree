package march10th2021;

import java.util.Scanner;

/*Write a program which take some fruits name as an input array and using binary search verify the given
fruit is there or not.
Input Validations:
String to be verified (second input) should be in lowercase and it should not be Alphanumeric
Example1:
Input1: {apple, mango, banana}
Input2: mango
Output: Yes
Example2:
Input1: {apple, MANGO, banana}
Input2: mango
Output: No




*/


public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of fruits");
		int numberOfFruits=scanner.nextInt();
		String  fruits[]=new String[numberOfFruits];
		
		System.out.println("Enter the fruits");
		
		for(int i=0;i<numberOfFruits;i++)
		{
			fruits[i]=scanner.nextLine();
		}
		boolean validation=false;
		System.out.println("Enter the fruit name");
		do {
		String fruit=scanner.nextLine();
		validation=validate(fruit);
		if(validation ==false)
			System.out.println("Enter correct fruit name");
		}while(validation==false);		
}

static boolean validate(String fruit)	
{
	for(int i=0;i<fruit.length();i++)
	{  
		if(!(fruit.charAt(i)>='a'&&fruit.charAt(i)<='z'))
			return false;
			
	}
	return true;
}
}
