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
            System.out.println(player.getName() + " has won the game");
            HasWon = true;
        }

    }

    public void Play() throws InterruptedException {
        int round = 0;

        Player Player1 = new Player("Player1");
        Player Player2 = new Player("Player2");


        Fields places = new Fields();

        Dice dice = new Dice();

        Scanner sc = new Scanner(System.in);

        System.out.println("The games is beginning in:");
        //Thread.sleep(1000);
        System.out.println("3");
        //Thread.sleep(1000);
        System.out.println("2");
        //Thread.sleep(1000);
        System.out.println("1");
        //Thread.sleep(1000);
        System.out.println("...");
        //Thread.sleep(1000);
        System.out.println("\n");


        while(Player1.account.getAccount() < 3000 || Player2.account.getAccount() < 3000) {
           if (round % 2 == 1) {
                if (!HasWon) {
                    System.out.print(Player1.getName() + "'s turn to throw the dice.\n");
                    System.out.println("Your account balance is: " + Player2.account.getAccount());
                    System.out.println("Press enter to throw dices");
                    sc.nextLine();
                    int sumDices = dice.roll(2);
                    Player1.setPosition(Player1.getPosition() + sumDices);
                    Player1.account.setAccount(Player1.account.getAccount() + places.placesPoint[Player1.getPosition()-2]);
                    System.out.println("You've rolled: " + sumDices);
                    System.out.println("Player1 you've landed on the field: " + places.getSquare(Player1.getPosition()-2));
                    System.out.println("Your new balance is: " + Player1.account.getAccount());
                    System.out.print("\n");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n");

                }
                CheckForWin(Player1);
                if (HasWon) {
                    break;
                } else {
                    System.out.print(Player2.getName() + "'s turn to throw the dice.\n");
                    System.out.println("Your account balance is: " + Player2.account.getAccount());
                    System.out.println("Press enter to throw dices");
                    sc.nextLine();
                    int sumDices = dice.roll(2);
                    Player2.setPosition(Player2.getPosition() + sumDices);
                    Player2.account.setAccount(Player2.account.getAccount() + places.placesPoint[Player2.getPosition()-2]);
                    System.out.println("You've rolled: " + sumDices);
                    System.out.println("Player2 you've landed on the field: " + places.getSquare(Player2.getPosition()-2));
                    System.out.println("Your new balance is: " + Player2.account.getAccount());
                    System.out.println("\n\n");

                }
                CheckForWin(Player2);
                if (HasWon) {
                    break;
                }
            }
            round++;
       }
   }
}
