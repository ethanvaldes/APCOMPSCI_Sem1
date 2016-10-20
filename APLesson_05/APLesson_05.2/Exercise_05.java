import java.util.Scanner;
public class Exercise_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You\'re in a maze!!! You need to escape!!! Do you turn right or left!?!?");
		String answerA = kb.next();
	if(answerA.equals("right")){
			System.out.println("Interesting choice. Someone is chasing you!! Do you fight or run?");
			String answerB = kb.next();
			if(answerB.equals("fight")){
				System.out.println("WHAT!??! WHY!?!  You tried fighting him but he was too strong and you got away but you're really lost now! Left or right?");
				String answerC = kb.next();
				if(answerC.equals("right"))
					System.out.println("You lost. Sorry bud but you're stuck in the maze forever now.");
				else
					System.out.println("You lost. Sorry bud but you're stuck in the maze forever now.");
			}
			else{
				System.out.println("Good choice! OK you see a path branching off your path to the left! Do you go straight or left?");
				String answerD = kb.next();
				if(answerD.equals("left"))
					System.out.println("You made it through the maze! Cool!!");
				else
					System.out.println("You lost. Sorry bud but you're stuck in the maze forever now.");
			}
	}		
		else{
			System.out.println("Okie doke! You found a special object! Do you pick it up or no?");
			String answerB = kb.next();
		
			if(answerB.equals("yes")){
				System.out.println("WHAT!??! WHY!?!  You blacked out and now youre in a different section of the maze! Do you keep going straight or lie down and give up?");
				String answerE = kb.next();
				if(answerE.equals("straight"))
					System.out.println("You lost. Sorry bud but you're stuck in the maze forever now.");
				else
					System.out.println("You lost. Sorry bud but you're stuck in the maze forever now.");
			}
			else{
				System.out.println("Good choice! OK you can either go right or left now! Which way do you choose?");
				String answerF = kb.next();
				if(answerF.equals("left"))
					System.out.println("You lost. Sorry bud but you're stuck in the maze forever now.");
				else
					System.out.println("You made it through the maze! Cool!!");
			}
		}
	}
}
