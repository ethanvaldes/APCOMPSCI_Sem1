import java.util.Scanner;
public class MagpieRunner_P2
{
	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie_P2 m = new Magpie_P2();
		
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

