import java.util.ArrayList;

public class Deck
{
	private ArrayList<Card> deck;

	public Deck()
	{
		deck = new ArrayList<Card>();
		deck = initDeck();
		deck = shuffleDeck();
	}

	public String toString()
	{
		String temp = "";
		for (Card c : deck)
			temp += c.toString() + "\n";
		return temp;
	}

	public Card getTopCard()
	{
		Card c = deck.get(0);
		deck.remove(0);
		return c;
	}

	public ArrayList<Card> shuffleDeck()
	{
		ArrayList<Card> t = new ArrayList<Card>();
		int i = 0;
		int n[] = new int[52];
		for (int j = 0; j < 52; j++)
		{
			i = (int) (Math.random() * 52);
			while (n[i] != 0)
				i = (int) (Math.random() * 52);
			n[i] = 1;
			t.add(deck.get(i));
		}
		return t;
	}

	}}return deck;}
}

Card c = new Card (r, s, p);p++;deck.add(c);

public static ArrayList <Card>initDeck () {
ArrayList <String> ranks = new ArrayList <String> (); ranks.add ("Ace");
ranks.add ("Two");
ranks.add ("Three");
                  ranks.add ("Four");
                  ranks.add ("Five");
                  ranks.add ("Six");
                  ranks.add ("Seven");
                  ranks.add ("Eight");
                  ranks.add ("Nine");
                  ranks.add ("Ten");
                  ranks.add ("Jack");
                  ranks.add ("Queen");
                  ranks.add ("King");
ArrayList <String> suites = new ArrayList <String> (); suites.add("clubs");
suites.add("diamonds");
suites.add("hearts");
                  suites.add("spades");
ArrayList <Card> deck = new ArrayList <Card> (); for (String s : suites) {
                        int p = 1;
                        for (String r: ranks) {
