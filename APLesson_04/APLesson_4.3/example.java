import java.util.Scanner;
public class example
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the width:");
		int width = kb.nextInt();
		System.out.println("Enter your height:");
		int height = kb.nextInt();
		
		int area = calcArea(width, height);
		
		System.out.println("Your area is " + area + " square feet.");
	}
	public static int calcArea(int w, int h)
	{
		return (w*h);
	}
}