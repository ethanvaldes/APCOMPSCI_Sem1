import java.util.ArrayList;
public class toyrunner
{
	public static void main(String[]args)
	{
		ArrayList<toy>toylist = new ArrayList<toy>();
		toylist.add(new car("hot wheels"));
		toylist.add(new figure("snow white"));
		
		for(toy t : toylist)
		{
			System.out.println(t);
		}
	}
}