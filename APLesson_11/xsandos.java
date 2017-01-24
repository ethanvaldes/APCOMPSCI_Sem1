public class xsandos
{
	public static void main(String[]args)
	{
		String[][]xando = new String [4][4];
		
		for(int i=0; i<xando.length; i++)
		{
			for(int j=0; j<xando[i].length; j++)
			{
				int pick = (int)(Math.random()*(2)+1);
				if (pick == 1)
					xando[i][j] = "x";
				else
					xando[i][j] = "o";
				System.out.print(xando[i][j] + "\t");
			}
			
			System.out.println("");
		}
	}
}