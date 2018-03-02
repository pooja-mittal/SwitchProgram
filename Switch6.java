import java.util.Scanner;
class Switch6
{
	public static void main(String[] args)
	{
		int num;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one number");
		num=scr.nextInt();
		switch(num)
		{
			case 1: case 2: case 3: case 4:
				System.out.println("number is < 5");
				break;
			case 5: case 6: case 7: case 8: case 9:
				System.out.println("number is > 5");
				break;
			default : System.out.println("exit");
		}
	}

}