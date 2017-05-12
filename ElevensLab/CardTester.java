/**
 * This is a class that tests the Card class.
 */
public class CardTester
{
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card card1 = new Card("3", "Hearts", 3);
 		Card card2 = new Card("2", "Spades",3);
  		Card card3 = new Card("3", "Hearts", 3);
  
  		System.out.println("One matches two? " + card1.matches(card2));
 		System.out.println("One matches three? " + card1.matches(card3));    
 		System.out.println("Suit of Card One: " + card1.suit());
  		System.out.println("Card one: " + card1.toString());
	}
}
