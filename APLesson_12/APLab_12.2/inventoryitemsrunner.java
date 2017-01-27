import java.util.Scanner;
public class inventoryitemsrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item name: ");
		String name = kb.next();
		System.out.println("Please enter item manufacturer: ");
		String manufacturer = kb.next();
		
		System.out.println("Will you be entering the category and price? (y or n)");
		String answer = kb.next();
		if(answer.equals("n"))
		{
			inventoryitems item1 = new inventoryitems(name, manufacturer);
			System.out.println(item1);
		}
		else if(answer.equals("y"))
		{
			System.out.println("Please enter item category: ");
			String category = kb.next();
			System.out.println("Please enter your item price: ");
			float price = kb.nextFloat();
			inventoryitems item1 = new inventoryitems(name, manufacturer, category, price);
			System.out.println(item1);
		}
		
		
		
	}
}