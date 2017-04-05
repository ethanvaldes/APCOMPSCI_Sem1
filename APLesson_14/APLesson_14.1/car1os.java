public abstract class car1os implements location1
{
	private double[] location;
	private int ID;
	
	public car1os()
	{
		ID = (int)(Math.random() * 1000000) + 1;
		location = new double[2];
	}
	
	public abstract void move(double x, double y);
	
	public double getID()
	{
		return ID;
	}
}