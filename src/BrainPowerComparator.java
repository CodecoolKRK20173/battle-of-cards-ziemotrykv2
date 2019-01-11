import java.util.Comparator;

public class BrainPowerComparator implements Comparator<Card> {

	@Override
	public int compare(Card player1Card, Card player2Card) {
		int returner = player2Card.getBrainPower() - player1Card.getBrainPower();
		return returner;
	}
}