class Player {
    CardsCollection cardsInHand = new CardsCollection();

    public Card getTopCard() {
        return cardList.get(0);
    }

    //public Card playTopCard() {}

    public static int chooseStat() {
        View.printCard(getTopCard());
        int choosenStat = getTopCard().getStatByString(View.getStatFromPlayer());
        return choosenStat;
    }


}
