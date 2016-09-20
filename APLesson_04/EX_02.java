import java.util.Scanner;

public class EX_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		EX_02 form = new EX_02();
		
		System.out.println("Enter your first name:");
		String name = kb.next();
		
		System.out.println("Enter your last name:");
		String last = kb.next();
		
		System.out.println("Enter your title:");
		String title = kb.next();
		String lol = kb.nextLine();
		
		System.out.println("Enter the school site:");
		String school = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		System.out.println("**************************************");
		form.format (school, year);
		form.format1 (name, last);
		form.format1 (title, subject);
		System.out.println("\n**************************************");
	}
	
	public void format(String column, String columntoo)
	{
		System.out.printf("*  %15s  %16s %1s", column, columntoo, "*");

	}
		
		public void format1(String columnone, String columntwo)
	{
		System.out.printf("\n*  %15s  %16s %1s", columnone, columntwo, "*");
	}
	
}