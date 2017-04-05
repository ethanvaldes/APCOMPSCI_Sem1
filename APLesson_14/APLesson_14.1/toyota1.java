import java.lang.Math.*;
import java.util.ArrayList;
import java.util.Arrays;
public class toyota1 extends car1os
{
	private double xx, yy;

	public toyota1(String nathan)
	{
		super();
		ArrayList<String> position = new ArrayList<>(Arrays.asList(nathan.split(", ")));
		Double nathanX = Double.parseDouble(position.get(0));
		Double nathanY = Double.parseDouble(position.get(1));
		move(nathanX, nathanY);
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