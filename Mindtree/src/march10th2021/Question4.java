package march10th2021;

import java.util.Scanner;

/*
 Question:
 Take sentence as an user input and find the vowels in the sentence and replace the next consonant
letter of the vowels with its next ASCII character.
Example1:
Input: I am good boy
Output: I an gooe boz
Example2:
Input: I an gooe boz
Output: I ao goof boa*/

/*
 algo
take string from user

traverse the string from the right side , if the character is vowel check next character if it is consonent then update the vowel to its
next element if it is not z if it is z convert it to starting alphabet.

*/

public class Question4 {

	public static void main(String[] args) {
		String answer="";
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
String sentence=scanner.nextLine();
for(int i=sentence.length()-1;i>=1;i--)
{	
	if(isAlphabat(sentence.charAt(i))&&!isVowel(sentence.charAt(i)))
	{
		if(isAlphabat(sentence.charAt(i-1))&&isVowel(sentence.charAt(i-1))) {
			if(sentence.charAt(i)=='z')
			{
				answer='a'+answer;
			continue;	
			}
			if(sentence.charAt(i)=='Z')
			{
				answer='A'+answer;
				continue;
			}
			answer=(char)(sentence.charAt(i)+1)+ answer;
		}
		else
			answer=sentence.charAt(i)+answer;
	}
		else
			answer=sentence.charAt(i)+answer;
			
		
	
}
answer=sentence.charAt(0)+answer;

System.out.println(answer);
	}
	static boolean isVowel(char c)
	{
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			return true;
		return false;
	}
	
	static boolean isAlphabat(char c)
	{
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
			return true;
		return false;
	}

}
