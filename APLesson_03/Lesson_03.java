import java.util.Scanner;

public class Lesson_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Who is our favorite teaher? ");
		
		String teacher = keyboard.next();
		
		System.out.println("Okay! " + teacher + " is very good!");
		}
	
}