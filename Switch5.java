import java.util.Scanner;
class Switch5
{
	public static void main(String[] args)
	{
		int num;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one number");
		num=scr.nextInt();
		for(int i=0; i<=num; i++) {
		switch(i)
		{
			case 1: System.out.println("zero");
					break;
			case 2: System.out.println("one");
					break;
			case 3: System.out.println("two");
					break;
			case 4: System.out.println("three");
					break;
			default : System.out.println("exit");
		}
		}
	}
}