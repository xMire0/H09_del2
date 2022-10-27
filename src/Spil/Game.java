package Spil;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Game {



    public Game() {
    }

    boolean HasWon = false;

    void CheckForWin(Player player) {
        if (player.account.getAccount() > 3000) {
            player.account.setAccount(3000);
            System.out.println("You won the game");
            HasWon = true;
        }

    }

    public void TakeTurn(Player player,int sumDices, Fields places) {
        Scanner sc = new Scanner(System.in);
        System.out.print(player.getName() + "'s turn to throw the dice.\n");
        System.out.println("Your account balance is: " + player.account.getAccount());
        System.out.println("Press enter to throw dices");
        sc.nextLine();
        player.setPosition(player.getPosition() + sumDices);
        player.account.setAccount(player.account.getAccount() + places.placesPoint[player.getPosition()]);
        System.out.println("You've rolled: " + sumDices);
        System.out.println(player.getName() + " you've landed on the field: " + places.getSquare(player.getPosition()));
        System.out.println("Your new balance is: " + player.account.getAccount());
        System.out.print("\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
    }

    public void Play() throws InterruptedException {
        int round = 0;

        Player p;

        Fields places = new Fields();

        Dice dice = new Dice();

        Scanner sc = new Scanner(System.in);

        System.out.println("The games is beginning in:");
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("\n");

        Playerlist pl = new Playerlist(2);
        pl.setCurrentPlayer(0);


        while(!HasWon) {
            p = pl.getCurrentPlayer();
            int sumDices = dice.roll(4);
            TakeTurn(p, sumDices, places);
            if (sumDices == 10) {
                sumDices = dice.roll(4);
                TakeTurn(p, sumDices, places);
            }
            CheckForWin(p);
            p = pl.NextPlayer();
        }
   }
}
