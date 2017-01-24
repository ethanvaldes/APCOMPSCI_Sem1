import java.util.Scanner;
import java.util.Arrays;
public class gamehealth
{
	static String[]health;
	static int HEALTHLOAD = 6;
	static int healthcount;
	
	public static void main(String[]args)
	{
		String turn = "";
		int damage = 0;
		int ammount = 0;
		healthcount = 6;
		health = new String[HEALTHLOAD];
		
		while (turn != "Q" && healthcount > 0)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Your turn! Hit Enter when ready:");
			turn = kb.nextLine();
			damage = (int)(Math.random()*(2)+1);
			ammount = (int)(Math.random()*(6)+1);
			System.out.println(takedamage(damage, ammount));
			printclip();
		}
		
		System.out.println("You died!!!");
	}
	
	public static String takedamage(int dmg, int amt)
	{
		if (dmg == 1)
		{
			healthcount -= amt;
			return ("Taking " + amt + " damage!"); 
		}
		else
		{
			if (healthcount + amt < HEALTHLOAD)
			{
				healthcount += amt;
			}
			else
			{
				healthcount = HEALTHLOAD;
			}
		}
		return ("Power Up " + amt + "!");
	}
	
	public static void printclip()
	{
		String output = "Health: \t";
		
		for (int i=0; i<HEALTHLOAD; i++)
		{
			if(i < healthcount)
			{
				health[i]= " @ ";
			}
			else
			{
				health[i]= "[]";
			}
			output += health[i];
		}
		
		System.out.println(output);
	}
}