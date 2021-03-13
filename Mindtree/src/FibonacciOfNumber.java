import java.util.Scanner;

public class FibonacciOfNumber {
	
	static int fibonacci(int n)
	{
		if(n==1)
			return 1;
		return n*fibonacci(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		System.out.println(fibonacci(s.nextInt()));
		

	}

}
