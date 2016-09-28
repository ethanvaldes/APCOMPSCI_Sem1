import java.util.Scanner;

public class cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the side length of your cube in inches?");
		side = kb.nextInt();
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = (side*side)*6;
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with " + side + " inch sides is %.5f.", sa);
	}
}