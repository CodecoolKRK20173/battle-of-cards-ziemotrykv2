import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class GameController {
    private static LogicHandler logicHandler = new LogicHandler();
    private Map<String, Comparator<Card>> comparatorMap = new HashMap<String, Comparator<Card>>();
    private Comparator<Card> comparator;
    private Board board;

    private int currentPlayer;

    public GameController() {
        setupComparatorMap();
        this.board = new Board();
        this.currentPlayer = logicHandler.chooseStartingPlayer();
    }

    public void run() {
        View.printMenu();
        menuHandler();

    }

    private void setupComparatorMap() {
        comparatorMap.put("1", new AngerComparator());
        comparatorMap.put("2", new TypingSpeedComparator());
        comparatorMap.put("3", new PunchPowerComparator());
        comparatorMap.put("4", new BrainPowerComparator());
        comparatorMap.put("5", new FunnyMeterComparator());
        comparatorMap.put("6", new AngerComparator());
        comparatorMap.put("7", new DemotivationComparator());
    }

    public void menuHandler() {
        switch (View.getInput()) {
            case 1: gameLoop();
                      break;
            case 2: System.exit(0);
                      break;
        }
    }

    public void SwitchPlayer() {
        if (currentPlayer == 0) {
            currentPlayer = 1;
        } else {
            currentPlayer = 0;
        }
    }

    public Player checkRoundWinner(int winner) {
        if (winner == 1) {
            return board.getPlayersList().get(0);
        } else {
            return board.getPlayersList().get(1);
        }
    }

    private void setComparator(int choosenStat) {
        comparator = comparatorMap.get(String.valueOf(choosenStat));
    }

    private void gameLoop() {
        while (logicHandler.notWon(board.getPlayersList())) {
            System.out.println("Player " + String.valueOf(currentPlayer + 1) + " Round\n\n");
            System.out.println("Player 1 cards: " + board.getPlayersList().get(0).getCardsInHandSize() +
            "\nPlayer 2 cards: " + board.getPlayersList().get(1).getCardsInHandSize() + "\n");
            board.addCurrentlyPlayingCards(board.getPlayersList().get(0).getTopCard(), board.getPlayersList().get(1).getTopCard());
            int choosenStat = board.getPlayersList().get(currentPlayer).chooseStat();
            setComparator(choosenStat);
            Card card1 = board.getPlayersList().get(0).getTopCard();
            Card card2 = board.getPlayersList().get(1).getTopCard();
            int comparedStats = comparator.compare(card1, card2) * -1;
            board.getPlayersList().get(0).playTopCard();
            board.getPlayersList().get(1).playTopCard();
            int winner = logicHandler.roundWinCheck(comparedStats);
            if (winner < 3) {
                board.giveCardsToWinner(checkRoundWinner(winner));
                System.out.println("Player " + winner + " won last round!!\n");
            } else {
                System.out.println("DRAW!\n");
                board.addCardsToDrawedCardsAndRemoveFromCurrentlyPlaying();
            }
            SwitchPlayer();
        }

        if(board.getPlayersList().get(0).checkIfLost()) {
            View.clearScreen();
            System.out.println("Player 2 won!");
        } else {
            View.clearScreen();
            System.out.println("Player 1 won!");
        }
    }

}
