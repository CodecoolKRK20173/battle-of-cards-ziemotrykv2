class LogicHandler {
    public static boolean notWon(ArrayList<Player> playersList) {
        for(int i = 0; i < playersList.size(); i++) {
            if(playersList.get(i).checkIfLost()) {
                return false;
            }
        }
        return true;
    }
}