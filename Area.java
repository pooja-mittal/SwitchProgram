import java.util.Scanner;
class Switch
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("1. area of circe");
		System.out.println("2. area of rectagele");
		System.out.println("3. area of square");
		System.out.println("which area you want to calculate please enter one number from 1-3");
		System.out.println("enter one number");
		int n=scr.nextInt();
		double pi=3.14;
		double area;
		switch(n) {
			case 1: System.out.println("enter the radius");
					int r=scr.nextInt(); 					
					area=pi*r*r;
					System.out.println("area of circle: " + area);
					break;
			case 2: System.out.println("enter the length and breadth of a rectangle");
					int l=scr.nextInt();
					int b=scr.nextInt();
					area=l*b;
					System.out.println("area of reactangle " + area);
					break;
			case 3: System.out.println("enter square side");
					int a=scr.nextInt();
					area=a*a;
					System.out.println("area of square: " + area);
					break;
		}
	}
}


