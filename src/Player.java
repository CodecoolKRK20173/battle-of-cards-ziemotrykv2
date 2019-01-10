class Player {
    CardsCollection cardsInHand = new CardsCollection();

    public Card getTopCard() {
        return cardList.get(0);
    }

    //public Card playTopCard() {}

    public int chooseStat() {
        View.printCard(getTopCard());
        int choosenStat = View.getStatFromPlayer();
        return choosenStat;
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
