public class averagenumbers
{
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("Numbers...");
		
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		

		System.out.println("\n");
		System.out.println("The average of the above numbers is..." + average(numbers));
		
	}
	
	public static int average(int[] num)
	{
		int ave = 0;
		for(int n : num)
			{
				ave += n;
			}
			
		return ave/10;
	}
}public class averagenumbers
{
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("Numbers...");
		
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		

		System.out.println("\n");
		System.out.println("The average of the above numbers is..." + average(numbers));
		
	}
	
	public static int average(int[] num)
	{
		int ave = 0;
		for(int n : num)
			{
				ave += n;
			}
			
		return ave/10;
	}
}