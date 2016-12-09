import java.util.Scanner;
public class findthezs
{
	static String[] words;
	
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		System.out.println("For the words...");
		printArray();
		System.out.println("\nOnly " + hasZs() + " contain(s) the letter z");
	}

	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		for(String w : words)
		{
			System.out.print(w + " ");
		}	
		
	}
	
	public static String hasZs()
	{
		String zs = " ";
		for(String w : words)
		{
			if(w.indexOf("z") >= 0)
				zs = zs+= w + " ";
		}	
		return zs;
	}
}	