public abstract class car2 implements location2
{
	private double [] location = new double[2];
	private double ID;
	
	public car2()
	{
		ID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}

	public double getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}