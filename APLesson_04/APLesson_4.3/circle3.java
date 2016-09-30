import java.util.Scanner;

public class circle3
{
	static double r;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the radius of your circle in inches?");
		r = kb.nextInt();
		double area = calcArea();
		print(area);
	}
	
	public static double calcArea()
	{
		return (r*r)*3.14;
	}
	
	public static void print(double a)
	{
		System.out.printf("The area of a circle with a " + r + " inch radius is %.5f.", a);
	}
}