import java.lang.Math.*;
import java.util.ArrayList;
public class ticketdriver
{
	public static void main(String[]args)
	{
		walkup w = new walkup(10);
		System.out.print(w);
		advance a = new advance(10);
		System.out.print(a);
		studentadvance sa = new studentadvance(10);
		System.out.print(sa);
		
	}
}