import java.util.Scanner;
class Switch4
{
	public static void main(String[] args)
	{
		String str;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one name");
		str=scr.next();
		switch(str)
		{
			case "pooja" : System.out.println("married");
							break;
			case "sachin" : System.out.println(str + " is not bachlor");
							break;
			default : System.out.println("null");
		}
	}

}