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

    public Player nintendoSwitchPlayer() {
        if (currentPlayer == 0) {
            currentPlayer = 1;
        } else {
            currentPlayer = 0;
        }
    }

    private void gameLoop() {
        while (LogicHandler.notWon(board.getPlayersList())) {
            board.addCurrentlyPlayingCards(firstPlayer.getTopCard(), secondPlayer.getTopCard());
            int choosenStat = board.getPlayersList.get(currentPlayer).chooseStat();
            LogicHandler.compareStats(firstPlayer.getTopCard().getStatByString(choosenStat), secondPlayer.getTopCard().getStatByString(choosenStat));


        }
    }




}
