import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card>cards = new ArrayList<>();

    public Deck() {
        for(int i = 0; i <=4 ; i++) {
            String suit;
            if(i==0) {
                suit = "Harten";
                for(int j = 2; j <= 10 ; j++) {
                    Card c = new Card(suit, "je hebt "+suit +" " +j, j);
                    cards.add(c);
                }
                    Card jack = new Card(suit, "Boer "+suit, 11);
                    Card Queen = new Card(suit, "Vrouw "+suit, 12);
                    Card King = new Card(suit, "Koning "+suit, 13);
                    Card Ace = new Card(suit, "Aas "+suit, 1);
                    cards.add(jack);
                    cards.add(Queen);
                    cards.add(King);
                    cards.add(Ace);
                }
            else if(i==1) {
                suit = "Schoppen";
                for(int j = 2; j <= 10 ; j++) {
                    Card c = new Card(suit, "je hebt "+suit +" " +j, j);
                    cards.add(c);
                }
                Card jack = new Card(suit, "Boer "+suit, 11);
                Card Queen = new Card(suit, "Vrouw "+suit, 12);
                Card King = new Card(suit, "Koning "+suit, 13);
                Card Ace = new Card(suit, "Aas "+suit, 1);
                cards.add(jack);
                cards.add(Queen);
                cards.add(King);
                cards.add(Ace);
            }
            else if(i==2) {
                suit = "klaveren";
                for(int j = 2; j <= 10 ; j++) {
                    Card c = new Card(suit, "je hebt "+suit +" " +j, j);
                    cards.add(c);
                }
                Card jack = new Card(suit, "Boer "+suit, 11);
                Card Queen = new Card(suit, "Vrouw "+suit, 12);
                Card King = new Card(suit, "Koning "+suit, 13);
                Card Ace = new Card(suit, "Aas "+suit, 1);
                cards.add(jack);
                cards.add(Queen);
                cards.add(King);
                cards.add(Ace);
            }
            else if(i==3) {
                suit = "Ruiten";
                for(int j = 2; j <= 10 ; j++) {
                    Card c = new Card(suit, "je hebt "+suit+" " +j, j);
                    cards.add(c);
                }
                Card jack = new Card(suit, "Boer "+suit, 11);
                Card Queen = new Card(suit, "Vrouw "+suit, 12);
                Card King = new Card(suit, "Koning "+suit, 13);
                Card Ace = new Card(suit, "Aas "+suit, 1);
                cards.add(jack);
                cards.add(Queen);
                cards.add(King);
                cards.add(Ace);
            }
            Collections.shuffle(cards);
        }
    }

	public Card getNextCard() {
		Card nextCard = cards.remove(0);
		cards.remove(nextCard);
		return nextCard;
	}

	public ArrayList<Card> getCards() {
		return cards;

	}
}
