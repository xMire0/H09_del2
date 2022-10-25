package Spil;

public class Main {
    public static void main (String[] args) {
        Game game = new Game();

        try {
            game.Play();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
