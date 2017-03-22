import java.lang.Math.*;
import java.util.ArrayList;
public class toyota implements location
{
	private double[] location = new double[2];
	private int ID;
	
	public toyota()
	{
		location[0] = 0;
		location[1] = 0;
	}
	
	public toyota(String kandle)
	{
		String[] points =kandle.split(", ");
		this.location[0] = Double.parseDouble(points[0]);
		this.location[1] = Double.parseDouble(points[1]);
	}
	
	public double getID()
	{
		ID = (int)(Math.random()*90000) + 100000;
		return ID;
	}
	
	public void move(double xx, double yy)
	{
		location[0] += xx;
		location[1] += yy;
	}
	
	public double[] getloc()
	{
		return location;
	}		
}	