public class Main 
{

	public static void main(String[] args) 
  {
		Card favoritecard = new Card("ace", "spades", 11);
		Card anothercard = new Card("five", "hearts", 5);
		Card getwellsoon = new Card("nine", "clubs", 9);
		
		
		System.out.println(favoritecard.getSuit());
		System.out.println(favoritecard.getRank());
		System.out.println(favoritecard.getPointValue());
		System.out.println(favoritecard.compare(anothercard));
		System.out.println(favoritecard.toString());
		
	}
	
}
