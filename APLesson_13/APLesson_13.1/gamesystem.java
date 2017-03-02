import java.lang.Math.*;
import java.util.ArrayList;
public class gamesystem
{
	private String platform;
	private int serialno;
	
	public gamesystem()
	{
		platform = "";
		serialno = 0;
	}
	
	public gamesystem(String p)
	{
		platform = "p";
		serialno = (int)(Math.random()*900000) + 1000000;
	}
	
	public String getplatform()
	{
		return platform;
	}
	
	public int getserialno()
	{
		return serialno;
	}
}