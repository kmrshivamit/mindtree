package ProjectManagement;

import java.util.Scanner;

public class CheckInvalidWord {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
	    for(int i=0;i<str.length();i++)
	    {  if(str.charAt(i)==' ')
	    	count++;
	    	
	    }
	    if(count>=2)
	    	System.out.println("Invalid word");
	    System.out.println("Valid word");

	}

}
