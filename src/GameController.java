class GameController {
    Board board;

    int currentPlayer;
    Player firstPlayer = board.getPlayersList.get(0);
    Player secondPlayer = board.getPlayersList.get(1);

    public GameController() {
        this.board = new Board();
        this.currentPlayer = LogicHandler.chooseStartingPlayer();
    }

    public void run() {
        View.printMenu();
        getMenuInput();
        gameLoop();

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
            return firstPlayer;
        } else {
            return secondPlayer;
        }
    }

    private void gameLoop() {
        while (LogicHandler.notWon(board.getPlayersList())) {
            board.addCurrentlyPlayingCards(firstPlayer.getTopCard(), secondPlayer.getTopCard());
            int choosenStat = board.getPlayersList.get(currentPlayer).chooseStat();
            int comparedStats = LogicHandler.compareStats(firstPlayer.getTopCard().getStatByString(choosenStat), secondPlayer.getTopCard().getStatByString(choosenStat));
            firstPlayer.playTopCard();
            secondPlayer.playTopCard();
            int winner = LogicHandler.roundWinCheck(comparedStats);
            if (winner < 3) {
                board.giveCardsToWinner(checkRoundWinner(winner));
                View.clearScreen();
                System.out.println("player " + winner + "won that round!");
                SwitchPlayer();
            } else {
                view.clearScreen();
                System.out.println("DRAW!");
                board.addCardsToDrawedCardsAndRemoveFromCurrentlyPlaying();
            }


        }

        System.out.println("Someone won");
    }

}
