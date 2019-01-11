import java.util.Comparator;

public class TypingSpeedComparator implements Comparator<Card> {

	@Override
	public int compare(Card player1Card, Card player2Card) {
		int returner = player2Card.getTypingSpeed() - player1Card.getTypingSpeed();
		return returner;
	}
}