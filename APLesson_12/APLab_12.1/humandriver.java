import java.util.Scanner;
public class humandriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your hair color: ");
		String hair = kb.next();
		System.out.println("Please enter your eye color: ");
		String eyes = kb.next();
		System.out.println("Please enter your skin color: ");
		String skin = kb.next();
	
		humanclass object = new humanclass(hair, eyes, skin);
		
		System.out.println("My info... \n Hair: " + object.getHair() + "\n Eyes: " + object.getEyes() + "\n Skin: " + object.getSkin());
		
		object.setHair("blonde");
		object.setEyes("purple");
		object.setSkin("golden brown");
		
		System.out.println("Friend's info... \n Hair: " + object.getHair() + "\n Eyes: " + object.getEyes() + "\n Skin: " + object.getSkin());
		
	}
}