import java.util.ArrayList;

class Board {
    private ArrayList<Player> playersList;
    private ArrayList<Card> currentlyPlayingCards;
    private ArrayList<Card> drawedCards;

    public Board() {
        playersList = new playersList();
    }

    public ArrayList<Player> getPlayersList() {
        return playersList;
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
        currentlyPlayingCards.add(a, b);
    }

    public void addCardsToDrawedCardsAndRemoveFromCurrentlyPlaying() {
        drawedCards.add(currentlyPlayingCards.get(0), currentlyPlayingCards.get(1));
        currentlyPlayingCards.clear();
    }

}
