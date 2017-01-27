import java.lang.Math.*;
public class inventoryitems
{
   private String manufacturer, name, category;
   private int UPC;
   private float price;

	public inventoryitems()
	{
	  manufacturer = "";
	  name = "";
	  category = "";
	  UPC = 0;
	  price = 0;
	}
  
	public inventoryitems(String m, String n, String c, float p)
	{
	  manufacturer = m;
	  name = n;
	  category = c;
	  price = p;
	}
	
	public inventoryitems(String m, String n)
	{
	  manufacturer = m;
	  name = n;
	}
	
	public String toString()
	{
		return "Item Info...\n Manufactuer: " + manufacturer + "\n Name: " + name + "\n Category: " + category + "\n Price: " + price;
	}
}