package Spil;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public Game() {
    }

    public void Play() throws InterruptedException {
        int round = 1;

        Player Player1 = new Player("Player1");
        Player Player2 = new Player("Player2");

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

        while(Player1.account.getAccount() < 3000 || Player2.account.getAccount() < 3000) {
            if (round % 2 == 1) {
                if (Player1.account.getAccount() < 3000) {
                    System.out.println("Your account balance is: " + Player2.account.getAccount());
                    System.out.print(Player1.getName() + "'s turn to throw the dice.\nPress enter to throw dices\n");
                    System.out.println("Your account balance is: " + Player2.account.getAccount());
                    sc.nextLine();
                    Player1.setPosition(Player1.getPosition() + dice.roll(2));
                }

                System.out.println("Player1 you've landed on the field: " + places.getSquare(Player1.getPosition()));
                System.out.print("\n");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n");

                if (Player1.account.getAccount() > 3000) {
                    Player1.account.setAccount(3000);

                }
                else if (Player2.account.getAccount() < 3000){
                    System.out.println("Your account balance is: " + Player2.account.getAccount());
                    Player2.setPosition(Player2.getPosition() + dice.roll(2));
                    System.out.print(Player2.getName() + "'s turn to throw the dice.\nPress enter to throw dices\n");
                    sc.nextLine();
                    Player2.setPosition(Player2.getPosition() + dice.roll(2));
                    System.out.println("You've rolled: " + );
                }

                System.out.println("Player2 you've landed on the field: " + places.getSquare(Player2.getPosition()));
                if (Player2.account.getAccount() > 3000) {
                    Player2.account.setAccount(3000);
                }

            }
            round++;
            break;
        }
    }
}
