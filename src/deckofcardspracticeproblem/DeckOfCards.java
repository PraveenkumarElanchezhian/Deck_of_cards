package deckofcardspracticeproblem;

import java.util.Scanner;

public class DeckOfCards {
	public static void main(String[] args) {

		Players rv2 = new Players();
		rv2.numOfPlayer();
		CardSequence rv3 = new CardSequence();
		rv3.playerCardSequence();
		Displaycards rv1 = new Displaycards();
		rv1.displaycards();
	}
}

// Initialize the deck
class Displaycards {
	void displaycards() {
		int[] deck = new int[52];
		String[] suits = { "Clubs", "Hearts", "Diamonds", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
// Initialize cards
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
// Display the all the cards
		for (int i = 0; i < 52; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println(rank + " of " + suit);
		}
//Distribute the cards by player
// shuffle
		int n = suits.length * ranks.length;
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			int temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
	}
}

//Get players from user
class Players {
	public void numOfPlayer() {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter number of players");
		int players = userinput.nextInt();
		if (players < 2 || players > 4) {
			System.out.println("Enter the players between 2 and 4");
		} else
			System.out.println("Number of players = " + players);
	}
}

// Player card sequence 
class CardSequence {
	public void playerCardSequence() {
		int i, j = 1;
		int player = 4;
		for (i = 1; i <= player; i++) {
			System.out.println("Card" + j++ + " received by player" + i);
		}
	}
}
