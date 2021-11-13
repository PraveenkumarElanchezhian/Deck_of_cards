package deckofcardspracticeproblem;

public class DeckOfCards {
	public static void main(String[] args) {
		Displaycards rv = new Displaycards();
		rv.displaycards();
	}
}
class Displaycards {
	void displaycards() {
	int[] deck = new int[52];
    String[] suits = {"Clubs", "Hearts", "Diamonds","Spades" };
    String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"};
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i;
    }
    for (int i = 0; i < 52; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out.println( rank + " of " + suit);
    }
    }
}