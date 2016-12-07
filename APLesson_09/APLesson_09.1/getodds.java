public class getodds
{
	static int[] numbers
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		System.out.println("For the following numbers..." + printArray());
		System.out.println(“The " + getOdds() + " are odd numbers");
	}

	public static int fillArray(numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
			return numbers
		}
	}
}	

