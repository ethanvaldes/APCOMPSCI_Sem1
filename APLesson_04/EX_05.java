import java.util.Scanner;

public class EX_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		EX_05 vol = new EX_05();
		
		System.out.println("What is the height of your box in inches?");
		double height = kb.nextDouble();
		
		System.out.println("What is the length of your box in inches?");
		double length = kb.nextDouble();
		
		System.out.println("What is the width of your box in inches?");
		double width = kb.nextDouble();
		
		double volume = vol.calcvol(height, length, width);
		
		System.out.println("The volume of your box is " + volume);
	}
	
	public double calcvol(double h, double l, double w)
	{
		return (h*l*w)/1728;
	}
}