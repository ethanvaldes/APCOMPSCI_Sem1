import java.util.Scanner;

public class notes_ex
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("We\'re going to add two integers");
		System.out.println("Please enter the first integer:");
		int first = kb.nextInt();
		System.out.println("Please enter the second integer:");
		int second = kb.nextInt();
		int third = first + second;
		
		method(third);
	}
	
	public static void method(int answer)
	{
		System.out.println("Your answer is " + answer + ".");
	}
}