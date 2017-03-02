public class gamerunner
{
	public static void main(String[]args)
	{
		xbox x = new xbox("xbox");
		System.out.println(x);
		playstation ps = new playstation("playstation");
		System.out.println(ps);
		thepc pc = new thepc("pc");
		System.out.println(pc);
	}
}