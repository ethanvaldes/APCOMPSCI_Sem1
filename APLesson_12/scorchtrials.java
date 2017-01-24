import java.util.Scanner;
public class scorchtrials
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a value for for x1: ");
		int x1 = kb.nextInt();
		System.out.println("Please enter a value for for y1: ");
		int y1 = kb.nextInt();
		System.out.println("Please enter a value for for x2: ");
		int x2 = kb.nextInt();
		System.out.println("Please enter a value for for y2: ");
		int y2 = kb.nextInt();
		
		scorchtrials object = new scorchtrials(x1, y1, x2, y2);
		
		System.out.println("The distance between (" + object.getxOne() + "," + object.getyOne() + ") and (" + object.getxTwo() + "," + object.getyTwo() + ") is " + object.getdist());
		
		object.setxOne(5);
		object.setyOne(5);
		object.setxTwo(10);
		object.setyTwo(10);
		
		System.out.println("The distance between (" + object.getxOne() + "," + object.getyOne() + ") and (" + object.getxTwo() + "," + object.getyTwo() + ") is " + object.getdist());
		
	}
}