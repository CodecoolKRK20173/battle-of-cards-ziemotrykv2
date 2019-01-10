class GameController {
    Board board;

    int currentPlayer;

    public GameController() {
        this.board = new Board();
        this.currentPlayer = LogicHandler.chooseStartingPlayer();
    }

    public void run() {
        View.printMenu();
        menuHandler();

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

    private void gameLoop() {
        while (LogicHandler.notWon(board.getPlayersList())) {
            System.out.println(board.getPlayersList().get(0).getCardsInHandSize() + " " + board.getPlayersList().get(1).getCardsInHandSize());
            board.addCurrentlyPlayingCards(board.getPlayersList().get(0).getTopCard(), board.getPlayersList().get(1).getTopCard());
            int choosenStat = board.getPlayersList().get(currentPlayer).chooseStat();
            int comparedStats = LogicHandler.compareStats(board.getPlayersList().get(0).getTopCard().getStatByString(choosenStat), board.getPlayersList().get(1).getTopCard().getStatByString(choosenStat));
            board.getPlayersList().get(0).playTopCard();
            board.getPlayersList().get(1).playTopCard();
            int winner = LogicHandler.roundWinCheck(comparedStats);
            if (winner < 3) {
                board.giveCardsToWinner(checkRoundWinner(winner));
                System.out.println("player " + winner + "won that round!");
                SwitchPlayer();
            } else {
                System.out.println("DRAW!");
                board.addCardsToDrawedCardsAndRemoveFromCurrentlyPlaying();
            }



        }

        System.out.println("Someone won");
    }

}
