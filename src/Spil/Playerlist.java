package Spil;

import java.util.Scanner;

public class Playerlist {

    Player[] players;

    Scanner sc = new Scanner(System.in);

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
            players[i] = new Player("Player" + i);
            players[i].setName(sc.nextLine());
        }

    }
}
