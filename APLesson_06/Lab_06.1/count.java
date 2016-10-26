import java.util.Scanner;
public class count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What number do you want to count up to?");
		int num = kb.nextInt();
		System.out.println("What will be the interval?");
		int interval = kb.nextInt();
		
		for(int i = 0; i <= num; i+=interval)
		{
			System.out.print(i + " ");
			
		}
	}
}