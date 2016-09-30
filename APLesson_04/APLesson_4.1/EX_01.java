import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		EX_01 form = new EX_01();
		
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		String lol1 = kb.nextLine();
		
		System.out.println("Please enter item 2:");
		String item2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		String lol2 = kb.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		String haha1 = "Subtotal";
		String haha2 = "Tax";
		String haha3 = "Total";
		
		double total1 = price1+price2+price3;
		double total2 = .07*total1;
		double total3 = total1+total2;
		
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format (item1, price1);
		form.format (item2, price2);
		form.format (item3, price3);
		System.out.println("\n");
		form.format1 (haha1, total1);
		form.format1 (haha2, total2);
		form.format1 (haha3, total3);
		System.out.println("\n__________________________________________");
		System.out.println(" * Thank you for your support *");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*  %15s ........      %3.2f", item, price);

	}
	
	public void format1(String haha, double total)
	{
		System.out.printf("\n*  %15s ........      %3.2f", haha, total);
	}
}