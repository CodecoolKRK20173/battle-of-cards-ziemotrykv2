import java.util.Random;
import java.util.ArrayList;

class LogicHandler {
    public boolean notWon(ArrayList<Player> playersList) {
        for(int i = 0; i < playersList.size(); i++) {
            if(playersList.get(i).checkIfLost()) {
                return false;
            }
        }
        return true;
    }

    public int chooseStartingPlayer() {
        Random generator = new Random();
        int i = generator.nextInt(2);
        return i;
    }

    public int compareStats(int stat1, int stat2) {
        int i = stat1 - stat2;
        return i;
    }

    public int roundWinCheck(int i) {
        if (i > 0) {
            return 1;
        } else if (i < 0) {
            return 2;
        } else {
            return 3;
        }
    }


}
