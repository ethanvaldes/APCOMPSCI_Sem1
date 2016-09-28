import java.util.Scanner;

public class rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of your rectangle?");
		l = kb.nextInt();
		System.out.println("What is the width of your rectangle?");
		w = kb.nextInt();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = (2*l)+(2*w);
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %.5f ft around.", perimeter);
	}
}