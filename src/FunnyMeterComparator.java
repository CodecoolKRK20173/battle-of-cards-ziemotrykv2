import java.util.Comparator;

public class FunnyMeterComparator implements Comparator<Card> {

	@Override
	public int compare(Card player1Card, Card player2Card) {
		int returner = player2Card.getFunnyMeter() - player1Card.getFunnyMeter();
		return returner;
	}
}