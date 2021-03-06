import java.util.ArrayList;

public class Player {
    private CardsCollection cardsInHand;

    public Player() {
        this.cardsInHand = new CardsCollection();
    }

    public Card getTopCard() {
        return cardsInHand.getTopCard();
    }


    public Card playTopCard() {
        return cardsInHand.getTopCardAndRemove();
    }

    public int chooseStat() {
        View.printCard(getTopCard());
        int choosenStat = View.getStatFromPlayer();
        return choosenStat;
    }

    public int getCardsInHandSize() {
        return cardsInHand.getCardList().size();
    }

    public void addCardToHand(Card cardToAdd) {
        cardsInHand.addCard(cardToAdd);
    }

    public void addListOfCardsToBottom(ArrayList<Card> cardsToInsert) {
        cardsInHand.insertListOfCardsToBottom(cardsToInsert);
    }

    public boolean checkIfLost() {
        return !cardsInHand.isNotEmpty();
    }
}
