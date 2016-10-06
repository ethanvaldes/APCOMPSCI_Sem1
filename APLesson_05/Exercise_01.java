import java.util.Random;
public class Exercise_01
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int player = rand.nextInt(6) + 1;
		int comp = rand.nextInt(6) + 1;
		
		rollDice();

		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + comp);
		System.out.println("The winner is... " + winner);
		
	}	
	
	public static boolean rollDice()
	{
		if(player > comp)
			return String winner = "you!";
		if(comp > player)
			return String winner = "the computer!";
		if (comp == player)
			return String winner = "no one. You tied!";
	}
	
}