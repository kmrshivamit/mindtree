import java.util.Scanner;

public class Power {
static int power(int b,int p)
{
	if(p==0)
		return 1;
	
	return b*power(b,p-1);
	
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter base");
		int b=s.nextInt();
		System.out.println("Enter power");
		int p=s.nextInt();
		System.out.println(power(b,p));

	}

}
