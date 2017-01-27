import java.lang.Math.*;
public class userclass
{
   private String firstname, lastname, avatar;
   private int userID;

	public userclass()
	{
	  firstname = "";
	  lastname = "";
	  avatar = "";
	  userID = 0;
	}
  
	public userclass(String fN, String lN)
	{
		firstName = fn;
		lastName = ln;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
}

	
	public userclass(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
		return "Item Info...\n Manufactuer: " + manufacturer + "\n Name: " + name + "\n Category: " + category + "\n Price: " + price;
	}
}