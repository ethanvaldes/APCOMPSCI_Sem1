import java.util.Scanner;
public class Exercise_06
{
	static Scanner kb;
	static String username;
	static String password;
	static String pass;
	static String user;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		username = "haha";
		password = "hahaha";
		passCheck();
		
	}
	
	public static void passCheck()
	{
		System.out.println("Please enter your username:");
		user = kb.next();
		System.out.println("Please enter your password:");
		pass = kb.next();
		
		if(password.equals(pass) && username.equals(user))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if(password.equals(pass))
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			
			else if(username.equals(user))
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}
			else
			{
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
		}
	}

}