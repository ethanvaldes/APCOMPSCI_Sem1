import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Lesson_04 form = new Lesson_04();
		
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
		double item3 = kb.nextDouble();
		
		form.format (item1, price1, item2, price2, item3, price3);
	}
	
	public void format(String itema, double pricea, String itemb, double priceb, String itemc, double pricec);
	{
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		System.out.printf("\n\n\n*  %15s ........      %3f.2", itema, pricea);
		System.out.printf("\n*  %15s ........      %3f.2", itemb, priceb);
		System.out.printf("\n*  %15s ........      %3f.2", itemc, pricec);
		System.out.printf("\n\n\n*  %15s ........      %3f.2", "Subtotal", pricea+priceb+pricec);
		System.out.printf("\n*  %15s ........      %3f.2", "Tax", 0.63);
		System.out.printf("\n*  %15s ........      %3f.2", "Total", pricea+priceb+pricec+0.63);
		System.out.println("__________________________________________");
		System.out.println(" * Thank you for your support *");
		
		
	}
}