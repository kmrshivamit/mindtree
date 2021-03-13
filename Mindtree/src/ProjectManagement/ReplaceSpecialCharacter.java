package ProjectManagement;

import java.util.Scanner;

public class ReplaceSpecialCharacter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c==' ')
				System.out.print(" ");
			else if(c>='A'&&c<='Z')
			{System.out.print(c);
			}
			else if(c>='a'&&c<='z')
				System.out.print(c);
			else
				System.out.print("*");
			

		}

	}

}
