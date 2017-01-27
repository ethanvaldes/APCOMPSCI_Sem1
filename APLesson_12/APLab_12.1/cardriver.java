import java.util.Scanner;
public class cardriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the paint color: ");
		String paint = kb.next();
		System.out.println("Please enter the type of interior: ");
		String interior = kb.next();
		System.out.println("Please enter the type of engine: ");
		String engine = kb.next();
		System.out.println("Please enter the type of tires: ");
		String tires = kb.next();
	
		carclass object = new carclass(paint, interior, engine, tires);
		
		System.out.println("Your car is ready... \n Paint: " + object.getPaint() + "\n Interior: " + object.getInterior() + "\n Engine: " + object.getEngine() + "\n Tires: " + object.getTires());
		
		object.setPaint("flames");
		object.setInterior("more flames");
		object.setEngine("loud");
		object.setTires("big");
		
		System.out.println("Your friend's car is ready... \n Paint: " + object.getPaint() + "\n Interior: " + object.getInterior() + "\n Engine: " + object.getEngine() + "\n Tires: " + object.getTires());
		
	}
}