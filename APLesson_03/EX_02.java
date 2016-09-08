import java.util.Scanner;

public class EX_02
{
	public static void main (Strin[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("hi im gonna calculate ur bmi bc as hilary duff once said, why not?");
		System.out.println("How tall are you in inches?");
		
		int h = keyboard.next();
		
		System.out.println("Cool. Now how much do you weigh in pounds?");
		
		int w = keyboard.next();
		int c = 703;
		int i = h * h;
		
		System.out.println("Sick!! Your BMI is " + w * c / i + "." thx ttyl.");
	}
}