import java.lang.Math.*;
import java.util.ArrayList;
public class GMC1 extends car1os
{
	private double xx, yy;
	
	public GMC1(double x, double y)
	{
		super();
		move(x,y);
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