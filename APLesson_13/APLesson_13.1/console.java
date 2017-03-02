public abstract class console extends gamesystem
{
	private String controller;
	
	public console()
	{
		super();
	}
	
	public console(String p)
	{
		super(p);
	}
	
	public abstract String getcontroller();
	
	public String toString()
	{
		return "Platform: " + getplatform() + "\nSerial #: " + getserialno() + "\nController: " + getcontroller();
	}
}