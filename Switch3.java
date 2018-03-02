import java.util.Scanner;
class Switch3
{
	public static void main(String[] args)
	{
		int roll;
		Scanner scr= new Scanner(System.in);
		System.out.println("enter one number");
		roll=scr.nextInt();
		switch(roll)
		{
			case 1: System.out.println("pooja");
					break;
			case 2: System.out.println("himanshu");
					break;
			case 3: System.out.println("sachin");
					break;
			default: System.out.println("exit");
		}
	}

}