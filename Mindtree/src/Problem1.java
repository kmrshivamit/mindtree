import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int lastIndexofFirstWord=0;
		int firstIndexofLastWord=0;
		String ans="";
		
		//calculate last index of first word
		
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==' ')
			{lastIndexofFirstWord=i-1;
			break;
				
			}
		
		//calculate first index of last word
		for(int i=str.length()-1;i>=0;i--)
		{ 
			if(str.charAt(i)==' ')
			{firstIndexofLastWord=i+1;
			break;
				
			}
		}
		
		
		
		for(int i=0;i<=lastIndexofFirstWord;i++)
			ans+=str.charAt(i);
		
		for(int i=lastIndexofFirstWord+1;i<firstIndexofLastWord;i++)
		{
			if(str.charAt(i)==' ')
				ans+=' ';
			else
				ans+=(char)(str.charAt(i)+1);
			
		}
		
		if(str.charAt(firstIndexofLastWord)>='A'&&(str.charAt(firstIndexofLastWord)<='Z'))
	ans+=str.charAt(firstIndexofLastWord);
		else
			ans+=(char)(str.charAt(firstIndexofLastWord)-32);
		if((str.charAt(str.length()-1)>='A')&&(str.charAt(str.length()-1)<='Z'))
			ans+=(char)(str.charAt(str.length()-1));
		else
			ans+=(char)(str.charAt(str.length()-1)-32);
		
		System.out.println(ans);
		
				

	}

}
