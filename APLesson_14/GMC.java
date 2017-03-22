import java.lang.Math.*;
import java.util.ArrayList;
public class GMC implements location
{
	private double x, y;
	private int ID;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC(double xx, double yy)
	{
		x = xx;
		y = yy;
	}
	
	public double getID()
	{
		ID = (int)(Math.random()*90000) + 100000;
		return ID;
	}
	
	public void move(double xxx, double yyy)
	{
		x += xxx;
		y += yyy;
	}
	
	public double[] getloc()
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}		
}	