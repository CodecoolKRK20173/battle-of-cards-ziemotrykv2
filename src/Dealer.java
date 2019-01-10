import java.util.Random;
import java.util.ArrayList;

class Dealer {
    CardsCollection deck;

    public Dealer() {
        deck = new CardsCollection();
        createDeck();
        shuffleDeck();
    }

    public Card dealCard() {
        Card toDeal = deck.getTopCard();
        deck.removeCard(toDeal);
        return toDeal;
    }

    private void shuffleDeck() {
        Random randomizer = new Random();
        int randomCardIndex;
        ArrayList<Card> toShuffle = deck.getCardList();
        ArrayList<Card> shuffled = new ArrayList<Card>();

        while(toShuffle.size() > 0) {
            randomCardIndex = randomizer.nextInt(toShuffle.size());
            shuffled.add(toShuffle.get(randomCardIndex));
            toShuffle.remove(randomCardIndex);
        }
        deck.clear();
        deck.insertListOfCardsToBottom(shuffled);
    }

    public CardsCollection getDeck() {
        return deck;
    }

    public int getDeckSize() {
        return deck.getCardList().size();
    }

    private void createDeck() {
        ArrayList<Card> creatingDeck = new ArrayList<Card>();
        creatingDeck.add(new Card("Zdenerwowany Dominik", 40, 30, 70, 25, 5, 90, 85));
        creatingDeck.add(new Card("Dominik Game Devoloper", 25, 60, 32, 75, 10, 5, 50));
        creatingDeck.add(new Card("Obiektowy Dominik", 40, 75, 45, 75, 85, 40, 50));
        creatingDeck.add(new Card("Prymitywny Dominik", 1, 20, 30, 80, 40, 50, 50));
        creatingDeck.add(new Card("Pomocny Marcin", 30, 80, 20, 85, 30, 35, 10));
        creatingDeck.add(new Card("Marcin Programista", 50, 90, 30, 65, 5, 60, 10));
        creatingDeck.add(new Card("Staly Klient Marcin", 10, 20, 50, 40, 5, 60, 10));
        creatingDeck.add(new Card("Burgerowy Marcin", 100, 0, 80, 0, 0, 90, 90));
        creatingDeck.add(new Card("Piotr Surface Leniartek", 10, 90, 15, 60, 50, 0, 40));
        creatingDeck.add(new Card("Tostozjadacz Piotr Leniartek", 100, 90, 60, 40, 30, 20, 15));
        creatingDeck.add(new Card("Efektywny pracownik piotr leniartek", 0, 110, 0, 110, 0, 0, 0));
        creatingDeck.add(new Card("Piotr Leniartek Zartownis", 10, 20, 40, 20, 0, 0, 0));
        
        deck.insertListOfCardsToBottom(creatingDeck);
    }

}
