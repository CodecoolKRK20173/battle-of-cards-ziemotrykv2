import java.util.Comparator;

public class DemotivationComparator implements Comparator<Card> {

	@Override
	public int compare(Card player1Card, Card player2Card) {
		int returner = player2Card.getDemotivation() - player1Card.getDemotivation();
		return returner;
	}
}