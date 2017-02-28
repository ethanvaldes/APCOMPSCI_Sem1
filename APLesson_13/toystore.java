import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class toystore
{
	public ArrayList<toy>toylist;
	public toystore()
	{
		toylist = new ArrayList<toy>();
	}
	
	public toystore(String ts)
	{
		loadtoys(ts);
	}
	
	public void loadtoys(String ts)
	{
		toylist = new ArrayList<toy>();
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i=0; i<toys.size(); i+=1)
		{
			String name = toys.get(i);
			String type = toys.get(i+=1);
			toy t = getThatToy(name);
			if(t == null)
			{
				if(type.equals("Car"))
				{
					toylist.add(new car(name));
				}
				else if(type.equals("AF"))
				{
					toylist.add(new figure(name));
				}
			}
			else
			{
				t.setCount(t.getCount()+1);
			}
		}
	}
	
	public toy getThatToy(String nm)
	{
		for(toy t:toylist)
		{
			if(t.getName().equals(nm))
			{
				return t;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(toy t:toylist)
		{
			if(max<t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(toy t:toylist)
		{
			if(t.getType().equals("Car"))
				cars+=1;
			if(t.getType().equals("Action Figure"))
				figures+=1;
		}
		if(cars>figures)
		{
			return "Cars";
		}
		if(cars<figures)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal amounts of cars and action figures!";
		}
	}
	
	public String toString()
	{
		String result = "";
		for(toy t:toylist)
		{
			result += " " + t;
		}
		return result;
	}
}