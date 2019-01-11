import java.util.Comparator;

public class AngerComparator implements Comparator<Card> {

	@Override
	public int compare(Card player1Card, Card player2Card) {
		int returner = player2Card.getAnger() - player1Card.getAnger();
		return returner;
	}
}