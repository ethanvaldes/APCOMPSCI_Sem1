import java.util.Scanner;

public class EX_03
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi! Wanna calculate how much of your life you spend sleeping? Ok let\'s do it!");
		System.out.println("On an average night, how many hours of sleep do you get?");
		
		double s = keyboard.nextDouble();
		double w = s * 7;
		double m = s * 30.4;
		double y = s * 365;
		double l = y * 100;
		double n = s / 24;
		double p = n * 100;
		
		System.out.println("Okay so that means you get an average of " + w + " hours a week, " + m + " hours a month, and " + y + " hours a year!");
		System.out.println("That means that if you live for 100 years, you\'ll get somewhere around " + l + " hours of sleep.");
		System.out.println("And finally, you\'ll spend " + p + " percent of your life asleep! Fun!");
	}
}