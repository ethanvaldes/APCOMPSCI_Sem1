import java.util.Scanner;

public class EX_03
{
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
		double year12 = year/12;
		
		System.out.println("What is the total life of the loan in years?");
		double life = kb.nextInt();
		
		double total = formula.calcformula(price, intrate, year12, life);
		System.out.printf("Your total monthly payment is $%6.2f\n", total);
	}
	
	public double calcformula(double principal, double rate, double compounded, double life)
	{
		return (Math.pow(principal*(1+(rate/compounded)), (compounded*life)));
	}
}