import java.util.Scanner;
class calculator
{
	public static void main(String[] args)
	{
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. exit");
		Scanner scr=new Scanner(System.in);
		System.out.println("enter your choice");	
		int n=scr.nextInt();
		switch(n)
		{
			case 1: System.out.println("enter two numbers");
					double a=scr.nextDouble();
					double b=scr.nextDouble();
					double c=a+b;
					System.out.println("addition of two numbers: " + c);
					break;
			case 2: System.out.println("enter two numbers");
					double p=scr.nextDouble();
					double q=scr.nextDouble();
					double r=p-q;
					System.out.println("subtraction of two numbers is: " + r);
					break;
			case 3: System.out.println("enter two numbers");
					int i=scr.nextInt();
					int j=scr.nextInt();
					int k=i*j;
					System.out.println("multiplication of two numbers: " + k);
					break;
			case 4: System.out.println("enter two numbers");
					double l=scr.nextDouble();
					double m=scr.nextDouble();
					double n1=l/m;
					System.out.println("division of two numbers: " + n1);
					break;
			case 5: System.out.println("try again");
		}
	}
}