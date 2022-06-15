
public class Card 
{

	private String suit;
	private String rank;
	private int pointValue;

  //constructor.
	public Card(String cardRank, String cardSuit, int cardPointValue) 
  {
     suit = cardSuit;
		 rank = cardRank;
		 pointValue = cardPointValue;	
  }


  //Accessors.
	public String getSuit() 
  {
    return suit;   
  }

	public String getRank() 
  {
    return rank;
  }

	public int getPointValue() 
  {
    return pointValue;
  }

  
  public Boolean compare(Card card) 
  {
		if(this.getSuit().equals(card.getSuit()) && this.getRank().equals(card.getRank()) && this.getPointValue() == card.getPointValue()) 
    {
		  return true;
  	}
  	else
    {
    	return false ;
	  }   
  }


	@Override
	 public String toString() 
  {
    return (rank + " of " + suit + " (point value = " + pointValue + ")");
  }
}
