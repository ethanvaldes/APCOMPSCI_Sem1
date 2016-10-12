import java.util.Random;
public class Exercise_01
{
	static String winner;
	static int player;
	static int comp;
	
	public static void main(String[]args)
	{
		Random rand = new Random();
		player = rand.nextInt(6) + 1;
		comp = rand.nextInt(6) + 1;
		
		winner = rollDice();

		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + comp);
		System.out.println("The winner is... " + winner);
		
	}	
	
	public static String rollDice()
	{
		if(player > comp)
			return "you!";
		if(comp > player)
			return "the computer!";
		else
			return "no one. You tied!";
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*  %15s ........      %3.2f", item, price);

	}
	
}