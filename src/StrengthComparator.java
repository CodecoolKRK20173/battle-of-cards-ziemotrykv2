import java.util.Comparator;

public class StrengthComparator implements Comparator<Card> {

	@Override
	public int compare(Card player1Card, Card player2Card) {
		int returner = player2Card.getStrength() - player1Card.getStrength();
		return returner;
	}
}