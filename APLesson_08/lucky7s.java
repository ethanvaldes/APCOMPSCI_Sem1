import java.util.Scanner;
public class lucky7s
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		System.out.println("There are " + luck(num) + " 7s in your number");
	}
	
	public static int luck(int num)
	{
		int lastdigit = (num % 10);
		if(num > 0)
			if (lastdigit == 7)
				return 1 + luck(num/=10);
			else
				return 0 + luck(num/=10);
		else
			return 0;
	}
}