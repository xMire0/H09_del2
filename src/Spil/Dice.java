package Spil;

public class Dice {


    public Dice() {
    }
    public int roll(int Dice) {
        int sum = 0;

        for(int i = 0; i < Dice; ++i) {
            sum += (int)(Math.random() * 6.0) + 1;
        }

        return sum;
    }
}
