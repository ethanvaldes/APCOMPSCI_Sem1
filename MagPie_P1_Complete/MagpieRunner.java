import java.util.Scanner;
public class MagpieRunner
{
	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie m = new Magpie();
		
		System.out.println (m.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (m.getResponse(statement));
			statement = in.nextLine();
		}
	}
}