import java.util.Scanner;
public class userclassrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstname = kb.next();
		System.out.println("Please enter your last name: ");
		String lastname = kb.next();
		
		System.out.println("Do you want a public avatar? (y or n)");
		String answer = kb.next();
		if(answer.equals("n"))
		{
			userclass user1 = new inventoryitems(firstname, lastname);
			System.out.println(user1);
		}
		else if(answer.equals("y"))
		{
			System.out.println("Enter the avatar: ");
			String avatar = kb.next();
			userclass user1 = new inventoryitems(firstname, lastname, avatar);
			System.out.println(user1);
		}
		
		
		
	}
}