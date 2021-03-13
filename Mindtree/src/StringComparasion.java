import java.util.Scanner;

public class StringComparasion {
	
	static char toLowerCaseIfNot(char c)
	{
		if(c>'Z')
			return c;
		else
		
			return (char)(c+32);
		
		
	}
	
   public static void main(String args[])
   {
	   System.out.println("Enter the string");
	   Scanner s=new Scanner(System.in);
	   String str=s.nextLine();
	   
	  String ans="";
	  
	  for(int i=0;i<str.length();i++)
	  {
		  char c=toLowerCaseIfNot(str.charAt(i));
		  System.out.println(c);
		  int count=0;
		  //traverse the whole array and count the number of first corrospending character
		  int j;
		  for( j=i;j<str.length();j++)
		  {
			  if(toLowerCaseIfNot(str.charAt(j))==c)
				  count++;
			  else
				  break;
			  
		  }
		  ans+=c;
		  ans+=count;
		  i=j-1;
		  
	  }
	   
	   System.out.println(ans);
	   
   }

}
