import java.util.Scanner;
public class treedeg60
{
	static String word;
	static int start = 0;
	static int stop;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		word = kb.next();
		stop = word.length();
		
		tree(word, start, word.length());
	}
	
	public static void tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("%15s\n", word.substring(0, start));
			start++;
			tree(word, start, stop);
		}
	}
}