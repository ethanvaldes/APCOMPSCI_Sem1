import java.util.Scanner;
import java.util.Arrays;
public class gamegun
{
	static int bulletcount;
	static int clipsize = 16;
	static int shotcount;
	static String[]clip;
	
	public static void main (String[]args)
	{
		bulletcount = 96;
		shotcount = 0;
		clip = new String[clipsize];
		resetclip();
		while(bulletcount > 0 || shotcount > 0)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Action:");
			String action = kb.next();
			if(action.equals("R"))
				reload();
			if(action.equals("S"))
				System.out.println(shoot());
			printclip();
		}
		System.out.println("Out of bullets!!!");
	}
	
	public static void resetclip()
	{
		for(int i=0; i<clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot()
	{
		if (shotcount > 0)
		{
			clip[shotcount-1] = "[]";
			shotcount -= 1;
			return "Boom!!!";
		}
		
		else
		{
			return "Reload!!!";
		}
	}
	
	public static void reload()
	{
		if(bulletcount >= clipsize)
		{
			bulletcount -= clipsize;
			shotcount = clipsize;
		}
		
		else
		{
			shotcount = bulletcount;
			bulletcount = 0;
		}
		
		resetclip();
		
		for(int i=0; i < shotcount; i++)
			clip[i] = " * ";
	}
	
	public static void printclip()
	{
		String output = "";
		System.out.println("Bullets: \t" + bulletcount + "\nclip:\t");
		for(int i=0; i<clipsize; i++)
			output += clip[i];
		System.out.println(output);
	}
}