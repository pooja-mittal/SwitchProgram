import java.util.Scanner;
class NestedSwitch1
{
	public static void main(String[] args)
	{
		char ch;
		int opt;
		Scanner scr=new Scanner(System.in);
		System.out.println("which sandwitch you want");
		ch=scr.next().charAt(0);
		switch(ch)
		{
			case 'b' : System.out.println("beef sandwich");
						break;
			case 'c' : System.out.println("chicken sandwich");
						break;
			case 'v' : System.out.println("enter which option");
						opt=scr.nextInt();
				switch(opt)
				{
					case 1: System.out.println("tomato");
							break;
					case 2: System.out.println("eggplant");
							break;
					case 3: System.out.println("cucumber");
							break;
					default : System.out.println("no option");
				}
				break;
				default : System.out.println("no andwitch available");
		}
	}
}