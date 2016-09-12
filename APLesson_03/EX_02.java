import java.util.Scanner;

public class EX_02
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi! I\'m gonna calculate your BMI.");
		System.out.println("First, how tall are you in inches?");
		
		double h = keyboard.nextDouble();
		
		System.out.println("Cool. Now how much do you weigh in pounds?");
		
		double w = keyboard.nextDouble();
		int c = 703;
		double i = h * h;
		
		System.out.println("Nice!! Your BMI is " + w * c / i + "." + " Thanks.");
	}
}