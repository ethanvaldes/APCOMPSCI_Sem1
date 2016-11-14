import java.util.Scanner;

public class EX_03
{
	static double total;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		EX_03 formula = new EX_03();
		
		System.out.println("We\'re going to calculate the total payment on your loan!");
		System.out.println("What is the original amount you intend to borrow?");
		double price = kb.nextDouble();
		
		System.out.println("What is the interest rate?");
		double intrate = kb.nextDouble();
		
		System.out.println("How many times is it compounded per year?");
		double year = kb.nextInt();
		
		System.out.println("What is the total life of the loan in years?");
		double life = kb.nextInt();

		System.out.printf("Your total monthly payment is $%6.2f\n", calcformula(price, intrate, year, life));
	}
	
	public static double calcformula(double p, double r, double n, double t)
	{
		total = p*(Math.pow(1+r/n, n * t));
		return total/(12*t);
	}
}