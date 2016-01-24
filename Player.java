import java.util.ArrayList;
import java.util.Random;

public class Player 
{
	String name;
	public Player(String n)
	{
		summe = 0;
		name = n;
		takeCard();
		takeCard();
	}

	static int summe = 0;
	int[] player = new int[6];
	public static ArrayList<Cards> taken = new ArrayList<Cards>();
	static boolean playing = true;

	public static void takeCard()
	{
		if(playing = true)
		{
			Random random = new Random();
			int randomnumber = random.nextInt(52);
			taken.add(Cards.allCards.get(randomnumber));
			Cards.allCards.remove(randomnumber);

			summe = randomnumber + summe;
			isPlaying();
		}
	}
	
	public static void isPlaying()
	{
		if(summe < 21)
		{
			playing = true;

		}
		if(summe > 21)
		{
			System.out.println("verloren");
			playing = false;
		}
	}
}
