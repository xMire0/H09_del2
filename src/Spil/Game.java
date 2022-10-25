package Spil;
public class Game {
    public Game() {
    }

    public void Play() {
        int round = 1;
        Player Player1 = new Player("Player1");
        Player Player2 = new Player("Player2");
        Fields places = new Fields();
        Dice dice = new Dice();
        System.out.println("Spillet er nu begyndt");

        while(Player1.account.getAccount() < 3000 || Player2.account.getAccount() < 3000) {
            if (round % 2 == 1) {
                if (Player1.account.getAccount() < 3000) {
                    Player1.setPosition(Player1.getPosition() + dice.roll(2));
                }

                System.out.println(places.getTower(Player1.getPosition()));
                System.out.println("Player1 du er landet på plads: " + Player1.getPosition());
                if (Player1.account.getAccount() > 3000) {
                    Player1.account.setAccount(3000);
                }
                break;
            }
        }

    }
}
