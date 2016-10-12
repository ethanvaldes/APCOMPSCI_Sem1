import java.util.Scanner;

public class Ex03
{
	static double h;
	static double w;
	static double bmi;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("How tall are you in inches?");
		h = kb.nextDouble();
		System.out.println("How much do you weigh in pounds?");
		w = kb.nextDouble();
		bmi = (w*703)/(h*h);
		condition = calcBMI();
		
		System.out.println("Your BMI is: " + bmi + ".");
		System.out.println("You are " + condition + ".");
		
	}
	
	public static String calcBMI()
	{
		
		if (bmi < 18.5)
			return "underweight";
		else if (bmi <= 24.9)
			return "normal";
		else if (bmi <= 29.9)
			return "overweight";
		else if (bmi <= 34.9)
			return "obese";
		else if (bmi <= 39.9)
			return "very obese";
		else
			return "morbidly obese";
	}
	
}
