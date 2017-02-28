public class toystorerunner
{
	public static void main(String[]args)
	{
		toystore store = new toystore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(store);
		
		System.out.println(store.getMostFrequentToy());
		System.out.println(store.getMostFrequentType());
	}
}