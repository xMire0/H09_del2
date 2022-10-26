package Spil;

public class Playerlist {

    Player[] players;

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = players[currentPlayer];
    }

    Player currentPlayer;
    int indexCurrentPlayer;

    public Player NextPlayer() {
        int numPlayer = this.players.length;
        indexCurrentPlayer = (indexCurrentPlayer + 1) % numPlayer;
        currentPlayer = players[indexCurrentPlayer];
        return currentPlayer;
    }
    public Playerlist(int numPlayer) {
        players = new Player[numPlayer];
        for (int i = 0; i < numPlayer; i++) {
            players[i] = new Player("Player" + (i + 1));
            players[i].setName("Player" + (1 + i));
        }

    }
}
