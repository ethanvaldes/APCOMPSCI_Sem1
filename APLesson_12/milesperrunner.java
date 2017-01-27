import java.util.Scanner;
public class milesperrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance: ");
		int distance = kb.nextInt();
		System.out.println("Please enter the hours: ");
		int hours = kb.nextInt();
		System.out.println("Please enter the minutes: ");
		int minutes = kb.nextInt();
	
		milesperhour object = new milesperhour(distance, hours, minutes);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes is " + object.getMPH());
		
		object.setDistance(5);
		object.setHours(5);
		object.setMinutes(10);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes is " + object.getMPH());
		
	}
}