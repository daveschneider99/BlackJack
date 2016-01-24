import java.util.ArrayList;

public class Cards 
{
	static ArrayList<Cards> allCards = new ArrayList<Cards>();
	final static int decks = 6;

	public Cards(int j) 
	{
		
	}

	static void fillDeck()
	{
		for(int i=1; i <= decks; i++)
		{
			for(int j=1; j <= 52; j++)
			{
				allCards.add(new Cards(j));
			}
		}
	}
}
