import java.util.Scanner;
public class MagpieRunner_P3
{
	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie_P3 m = new Magpie_P3();
		System.out.println (m.getResponse(""));
		System.out.println(m.getResponse("I know not no."));
		System.out.println (m.getResponse("My dog died."));
		System.out.println(m.getResponse("My Father is lazy."));
		System.out.println(m.getResponse("I want to sleep."));
		System.out.println(m.getResponse("I hate you."));
		System.out.println(m.getResponse("You love me."));
	}
}