import java.util.ArrayList;

class CardsCollection {
    private ArrayList<Card> cardList;

    public CardsCollection() {
        this.cardList = new ArrayList<Card>();
    }

    public Card getTopCard() {
        return cardList.get(0);
    }

    public Card getTopCardAndRemove() {
        Card topCard = getTopCard();
        cardList.remove(0);
        return topCard;
    }

    private void insertCardToBottom(Card cardToInsert) {
        cardList.add(cardToInsert);
    }

    public void insertListOfCardsToBottom(ArrayList<Card> cardsToInsert) {
        for(int i = 0; i < cardsToInsert.size(); i++) {
            insertCardToBottom(cardsToInsert.get(i));
        }
    }

    public boolean isNotEmpty() {
        return cardList.size() > 0;
    }

    public ArrayList<Card> getCardList() {
        return cardList;
    }

    public void removeCard(Card cardToRemove) {
        cardList.remove(cardToRemove);
    }

    public void addCard(Card cardToAdd) {
        cardsList.add(cardToAdd);
    }
}