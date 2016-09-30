import java.util.Scanner;

public class average3
{
	static double num1;
	static double num2;
	static double num3;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your first number?");
		num1 = kb.nextInt();
		System.out.println("Your second?");
		num2 = kb.nextInt();
		System.out.println("Your third?");
		num3 = kb.nextInt();
		double avg = average();
		print(avg);
	}
	
	public static double average()
	{
		return (num1+num2+num3)/3;
	}
	
	public static void print(double a)
	{
		System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %.5f.", a);
	}
}