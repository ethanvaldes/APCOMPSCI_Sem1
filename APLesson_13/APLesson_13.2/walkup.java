import java.lang.Math.*;
import java.util.ArrayList;
public class walkup extends ticket
{
	private int daysleft;
	public walkup()
	{
		super();
		daysleft = 0;
	}
	
	public walkup(int dl)
	{
		super();
		daysleft = dl;
	}
	
	public double getprice()
	{
		return 50.00;
	}
}