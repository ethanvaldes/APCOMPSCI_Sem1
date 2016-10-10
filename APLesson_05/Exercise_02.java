import java.util.Scanner;
public class Exercise_02
{
	static double price1;
	static double price2;
	static double price3;
	static double price4;
	static String item1;
	static String item2;
	static String item3;
	static String item4;
	static double subtotal;
	static double discount;
	static double tax;
	static double total;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Exercise_02 calculate = new Exercise_02();
		Exercise_02 form = new Exercise_02();
		
		System.out.println("What is your first item?");
		item1 = kb.nextLine();
		System.out.println("Please enter the price of " + item1 + ".");
		price1 = kb.nextDouble();
		String trash1 = kb.nextLine();
		System.out.println("What is your second item?");
		item2 = kb.nextLine();
		System.out.println("Please enter the price of " + item2 + ".");
		price2 = kb.nextDouble();
		String trash2 = kb.nextLine();
		System.out.println("What is your third item?");
		item3 = kb.nextLine();
		System.out.println("Please enter the price of " + item3 + ".");
		price3 = kb.nextDouble();
		String trash3 = kb.nextLine();
		System.out.println("What is your fourth item?");
		item4 = kb.nextLine();
		System.out.println("Please enter the price of " + item4 + ".");
		price4 = kb.nextDouble();
		subtotal = price1+price2+price3+price4;
		discount = calculate.discount();
		tax = .075*(subtotal);
		total = subtotal - discount + tax;

		System.out.println("<<<<<<<<<<<<<<<  Receipt  >>>>>>>>>>>>>>>>");
		form.format (item1, price1);
		form.format (item2, price2);
		form.format (item3, price3);
		form.format (item4, price4);
		form.format  ("Subtotal", subtotal);
		form.format  ("Discount", discount);
		form.format  ("Tax", tax);
		form.format  ("Total", total);
		System.out.println("\n__________________________________________");
		System.out.println("Thanks!!! You rock!!!");
	}	
	
	public static double discount()
	{
		if(subtotal >= 2000)
			return .15*subtotal;
		else
			return 0;
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*  %15s ........      %3.2f", item, price);

	}
	
}