import java.util.Random;
import java.util.ArrayList;

class LogicHandler {
    public static boolean notWon(ArrayList<Player> playersList) {
        for(int i = 0; i < playersList.size(); i++) {
            if(playersList.get(i).checkIfLost()) {
                return false;
            }
        }
        return true;
    }

    public static int chooseStartingPlayer() {
        Random generator = new Random();
        int i = generator.nextInt(2);
        return i;
    }

    public static int compareStats(int stat1, int stat2) {
        int i = stat1 - stat2;
        return i;
    }

    public static int roundWinCheck(int i) {
        if (i > 0) {
            System.out.println("player1");
            return 1;
        } else if (i < 0) {
            System.out.println("player2");
            return 2;
        } else {
            return 3;
        }
    }


}
