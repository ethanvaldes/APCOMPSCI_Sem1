import java.lang.Math.*;
import java.util.ArrayList;
public class advance extends ticket
{
	private int daysleft;
	public advance()
	{
		super();
		daysleft = 0;
	}
	
	public advance(int dl)
	{
		super();
		daysleft = dl;
	}
	
	public double getprice()
	{
		if(daysleft >= 10)
			return 30.00;
		else
			return 40.00;
	}
}