import java.lang.Math.*;
import java.util.ArrayList;
public class honda1 extends car1os
{
	private double xx, yy;
	
	public honda1(double [] kandle)
	{
		super();
		move(kandle[0], kandle[1]);
	}
		
	public void move(double x, double y)
	{
		this.xx += x;
		this.yy += y;
	}
	
	public double[] getLoc()
	{
		double[] location = {xx,yy};
		return location;
	}		
}	