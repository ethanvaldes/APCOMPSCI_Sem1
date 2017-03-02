public class thepc extends gamesystem
{
	private String controller;
	
	public thepc()
	{
		super();
	}
	
	public thepc(String p)
	{
		super(p);
	}
	
	public String systeminput()
	{
		return "Keyboard and Mouse";
	}
	
	public String getplatform()
	{
		return "PC";
	}
	
	public String toString()
	{
		return "Platform: " + getplatform() + "\nSerial #: " + getserialno() + "\nCSystem Input: " + systeminput();
	}
}