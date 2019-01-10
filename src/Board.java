import java.util.ArrayList;

class Board {
    private ArrayList<Player> playersList;
    private ArrayList<Card> currentlyPlayingCards;
    private ArrayList<Card> drawedCards;

    public Board() {
        playersList = new ArrayList<Player>();
        currentlyPlayingCards = new ArrayList<Card>();
        drawedCards = new ArrayList<Card>();
        playersList.add(new Player());
        playersList.add(new Player());
        dealCards();
    }

    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public void dealCards() {
        Dealer dealer = new Dealer();
        int playerTurn = 0;
        while(dealer.getDeckSize() > 0) {
            System.out.println("wkladam");
            playersList.get(playerTurn).addCardToHand(dealer.dealCard());
            System.out.println("wlozylem");
            System.out.println("wzialem z gory");
            switch(playerTurn) {
                case 0: playerTurn = 1;
                        break;
                case 1: playerTurn = 0;
                        break;
            }
        }
    }

    public void giveCardsToWinner(Player winner) {
        for(int i = 0; i < playersList.size(); i++) {
            if(winner == playersList.get(i)) {
                if(currentlyPlayingCards.size() > 0) {
                    playersList.get(i).addListOfCardsToBottom(currentlyPlayingCards);
                    currentlyPlayingCards.clear();
                }
                if(drawedCards.size() > 0) {
                    playersList.get(i).addListOfCardsToBottom(drawedCards);
                    drawedCards.clear();
                }
            }
        }
    }

    public void addCurrentlyPlayingCards(Card a, Card b) {
        currentlyPlayingCards.add(a);
        currentlyPlayingCards.add(b);
    }

    public void addCardsToDrawedCardsAndRemoveFromCurrentlyPlaying() {
        drawedCards.add(currentlyPlayingCards.get(0));
        drawedCards.add(currentlyPlayingCards.get(1));
        currentlyPlayingCards.clear();
    }

}
