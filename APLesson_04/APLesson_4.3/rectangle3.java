import java.util.Scanner;

public class rectangle3
{
	static double l;
	static double w;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of your rectangle?");
		l = kb.nextInt();
		System.out.println("What is the width of your rectangle?");
		w = kb.nextInt();
		double perimeter = calcPerim();
		print(perimeter);
	}
	
	public static double calcPerim()
	{
		return (2*l)+(2*w);
	}
	
	public static void print(double p)
	{
		System.out.printf("Your rectangle is %.5f ft around.", p);
	}
}