import java.util.Scanner;
class Switch2
{
	public static void main(String[] args)
	{
		int m,y;
		Scanner scr= new Scanner(System.in);
		System.out.println("enter one number between 1-12");
		m=scr.nextInt();
		System.out.println("enter the year");
		y=scr.nextInt();
		switch(m)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("31 days");
			break;
			case 9: case 4: case 6: case 11 : 
				System.out.println("30 days");
			break;
			case 2: 
				if((y%400==0) || ((y%4==0) && (y%100!=0)))
					{
						System.out.println("leap year");
					} else {
						System.out.println("non leap year");
					}
					break;
					default: System.out.println("try again");
		}
		
	}
}