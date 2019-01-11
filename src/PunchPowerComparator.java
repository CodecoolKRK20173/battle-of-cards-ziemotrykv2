import java.util.Comparator;

public class PunchPowerComparator implements Comparator<Card> {

	@Override
	public int compare(Card player1Card, Card player2Card) {
		int returner = player2Card.getPunchPower() - player1Card.getPunchPower();
		return returner;
	}
}