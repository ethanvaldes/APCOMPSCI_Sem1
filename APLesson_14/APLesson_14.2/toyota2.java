import java.lang.Math.*;
import java.util.ArrayList;
import java.util.Arrays;
public class toyota2 extends car2
{
	private double xx, yy;

	public toyota2(String nathan)
	{
		super();
		ArrayList<String> position = new ArrayList<>(Arrays.asList(nathan.split(", ")));
		Double nathanX = Double.parseDouble(position.get(0));
		Double nathanY = Double.parseDouble(position.get(1));
		move(nathanX, nathanY);
	}
}