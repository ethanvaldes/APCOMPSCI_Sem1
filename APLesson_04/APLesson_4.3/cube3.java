import java.util.Scanner;

public class cube3
{
	static double side;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the side length of your cube in inches?");
		side = kb.nextInt();
		double sa = calcSurf();
		print(sa);
	}
	
	public static double calcSurf()
	{
		return (side*side)*6;
	}
	
	public static void print(double sa)
	{
		System.out.printf("The surface area of a cube with " + side + " inch sides is %.5f.", sa);
	}
}