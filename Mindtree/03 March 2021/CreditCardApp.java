import java.util.Scanner;
//
/*this application will consists of
1. add payment details to the system and display
2. While displaying card details, only last 4 digits of card number should be displayed
3.
*/
/**
 * @author kumar Shivam
 * 
 * 
 *
 */
public class CreditCardApp {
	static Scanner s = new Scanner(System.in);
	static int count=0;
	static Payment payments[]=new Payment[1];
	static void resize()
	{
	Payment newarr[]=new Payment[2*payments.length];
	payments=newarr;
	}
	
	public static void main(String[] args) {
		String repeat;
		// TODO Auto-generated method stub
		do {
			int choice = menu();
			switch (menu()) {
			case 1:
				add();
				displayAll();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
			}
			System.out.println("Enter true if you want to continue");
repeat=s.nextLine();
		} while (repeat.equals("true"));
	}
	private static void displayAll() {
		// TODO Auto-generated method stub
		
	}
	private static void add() {
		if(count==payments.length)
			resize();
		  long id;
		 String customerName;
		 double amountPaid;
		 String cardType;
		 String expiryDate;
		 String cardNumber;
		
		System.out.println("Enter customer name");
		customerName=s.nextLine();
		amountPaid=Double.parseDouble((s.nextLine()));
		do {
			System.out.println("Enter card appropriate card type");			
		cardType=s.nextLine();
		}while(!(cardType.equals("MASTER")||cardType.equals("VISA")||cardType.equals("AMEX")));
		System.out.print("Enter expiry date");
		expiryDate=s.nextLine();
		System.out.println("Enter 10 digits card number");
		cardNumber=s.nextLine();
		payments[count++]=new Payment(  customerName,  amountPaid,  cardType,  expiryDate, cardNumber);

		
		 
		// TODO Auto-generated method stub
		
	}
	private static int menu() {
		System.out.println(" Enter 1 to add card details" + "and display it");
		System.out.println("Enter 2 for Search for card type and display "
				+ "all payment details that were processed through given card type");
		System.out.println(
				"Enter 3 toSort payment details by amount" + "paid in descending order and display top 2 payments ");
		System.out.println("Enter 4 to Update expiry date for customer name" + "and display updated card detaisl");
		int n = Integer.parseInt(s.nextLine());
		return n;
	}
}
