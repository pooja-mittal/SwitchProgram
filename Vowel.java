import java.util.Scanner;
class Vowel
{
	public static void main(String[] args)
	{
		char ch;
		Scanner scr= new Scanner(System.in);
		System.out.println("enter one charcater");
		ch=scr.next().charAt(0);
		switch(ch)
		{
			case 'a' : case 'e' :  case 'i' : case 'o' : case 'u' :
				System.out.println("vowels");
				break;
			default : System.out.println("consonant");
		}
	}
}