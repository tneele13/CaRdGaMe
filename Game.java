import java.util.Scanner;

public class Game {

	private int score = 0;
	private static Card currentCard;
	private Card nextCard;
	private Deck deck = new Deck();
	private Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println("Welkom bij de cardgame!");
		System.out.println("Er word steeds een kaart weergegeven\njij moet zeggen of de volgende kaart hoger of lager is.");
		System.out.println("Succes!");
		Game game = new Game();
		game.gameTurn();
		deck.getNextCard();
		
		
	}

	
	public void gameTurn() {
		nextCard = deck.getNextCard();
		currentCard = deck.getNextCard();
		System.out.println("\njouw gegeven kaart is :"+currentCard);
		System.out.println("Is de volgende kaart hoger of lager?");
		String answer = input.nextLine();
		
		if(answer.toLowerCase().contentEquals("hoger") && nextCard.isHigherOrEqual(currentCard)) {
			System.out.println("Je koos hoger\nDit is: ");
			correct();
		}else if(answer.toLowerCase().equals("lager") && !nextCard.isHigherOrEqual(currentCard)) {
			System.out.println("Je koos lager\nDit is: ");
			correct();
		}else {
			gameOver();
		}
	}

	public void correct() {
		currentCard = nextCard;
		score++;
		System.out.print("Goed! 1 punt erbij, je score is: " +score);
		System.out.println("");
		gameTurn();
		
	}
	
	public void gameOver() {
	System.out.println("Fout!\nGame Over\nJe score is: " +score);
	}
	

}
