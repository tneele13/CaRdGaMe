public class Card {
	
	private String suit;
	private String name;
	private int value;
	
	public Card(String suit, String name, int value) {
			this.name = name;
			this.suit = suit;
			this.value = value;
		
	}
	
	public String toString() {
		return name;
		
	}
	
	public boolean isHigherOrEqual(Card c) {
	
		if(this.value >= c.getValue()) {
			return true;
		}else {
		return false;
		}
	}
	
	public int getValue() {
		return value;
	}



}