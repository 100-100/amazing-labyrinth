package objects;

<<<<<<< HEAD
import java.util.Arrays;

public class Player {
	private int row, col;
=======
import java.awt.Color;
import java.util.Arrays;

public class Player {
	private Color colour;
>>>>>>> upstream/master
	private boolean playing;
	private boolean[] found;
	private Card[] hand;
	
	
<<<<<<< HEAD
	public Player(int numCards, int row, int col, boolean playing) {
		hand = new Card[numCards];
		found = new boolean[numCards];
		for (int i = 0; i < numCards; i++) {
			hand[i] = Deck.getCard();
		}
		this.row = row;
		this.col = col;
=======
	public Player(int numCards, Color colour, boolean playing) {
		Deck deck = new Deck();
		hand = new Card[numCards];
		found = new boolean[numCards];
		for (int i = 0; i < numCards; i++) {
			hand[i] = deck.getCard();
		}
		this.colour = colour;
>>>>>>> upstream/master
		this.playing = playing;
	}

	public boolean[] getFound() {
		return found;
	}

	public void setFound(boolean[] found) {
		this.found = found;
	}
<<<<<<< HEAD
=======
	
	public Color getColour() {
		return colour;
	}
>>>>>>> upstream/master

	public Card[] getHand() {
		return hand;
	}

	public void setHand(Card[] hand) {
		this.hand = hand;
	}

<<<<<<< HEAD
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

=======
>>>>>>> upstream/master
	public boolean isPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Player [row=" + row + ", col=" + col + ", playing=" + playing + ", found=" + Arrays.toString(found)
				+ ", hand=" + Arrays.toString(hand) + "]";
	}
=======
		return "Player [colour=" + colour + ", playing=" + playing + ", found=" + Arrays.toString(found) + ", hand="
				+ Arrays.toString(hand) + "]";
	}

>>>>>>> upstream/master
}
