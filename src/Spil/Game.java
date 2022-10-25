package Spil;
import java.util.Scanner;
import java.util.Random;
public class Game {
    public Game() {
    }

    public void Play() {
        int round = 1;

        Player Player1 = new Player("Player1");
        Player Player2 = new Player("Player2");

        Fields places = new Fields();

        Dice dice = new Dice();

        Scanner sc = new Scanner(System.in);

        System.out.println("Spillet er nu begyndt");

        System.out.println("\n");

        while(Player1.account.getAccount() < 3000 || Player2.account.getAccount() < 3000) {
            if (round % 2 == 1) {
                if (Player1.account.getAccount() < 3000) {

                    System.out.println(Player1.getName() + "'s turn to throw the dice. ");
                    sc.nextLine();

                    Player1.setPosition(Player1.getPosition() + dice.roll(2));
                }

                System.out.println("Player1 du er landet på plads: " + Player1.getPosition());
                System.out.println(places.getSquare(Player1.getPosition()));

                System.out.println("\n\n");

                if (Player1.account.getAccount() > 3000) {
                    Player1.account.setAccount(3000);
                }
                else if (Player2.account.getAccount() < 3000){
                    Player2.setPosition(Player2.getPosition() + dice.roll(2));

                    System.out.println(Player2.getName() + "'s turn to throw the dice. ");
                    sc.nextLine();
                }
                System.out.println("Player2 du er landet på plads: " + Player2.getPosition());
                System.out.println(places.getSquare(Player2.getPosition()));
                if (Player2.account.getAccount() > 3000) {
                    Player2.account.setAccount(3000);
                }
                break;
            }
            round++;
        }
    }
}
