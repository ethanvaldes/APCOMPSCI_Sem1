import java.util.Scanner;
public class Ex01
{
	static String math;
	static String bio;
	static String english;
	static String compsci;
	static String spanish;
	static String physics;
	static String history;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your letter grade in math: ");
		math = kb.next();
		System.out.println("Please enter your letter grade in bio: ");
		bio = kb.next();
		System.out.println("Please enter your letter grade in english: ");
		english = kb.next();
		System.out.println("Please enter your letter grade in compsci: ");
		compsci = kb.next();
		System.out.println("Please enter your letter grade in spanish: ");
		spanish = kb.next();
		System.out.println("Please enter your letter grade in physics: ");
		physics = kb.next();
		System.out.println("Please enter your letter grade in history: ");
		history = kb.next();
	
		double gPoints = calcPoints(math) + calcPoints(bio) + calcPoints(english) + calcPoints(compsci) + calcPoints(spanish) + calcPoints(physics) + calcPoints(history);
		double gpa = gPoints/7;
		System.out.println("Your gpa is " + gpa + ".");
	
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		else
			return 0.0;
		
	}
}