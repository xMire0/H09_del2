package Spil;

public class Fields {
    public Fields(){}
    int[] placesPoint = {0, 250,  -100,  100,  -20,  180,  0,  -70, 60,  -80, -50,  650};

    String[][] placesString = {{"Tower, Godt gået! Du har modtaget 250 point"}, {"Crater, Desværre! du har mistet 100 point"},
            {"palaceGates, Tillykke! du har modtaget 100 point"},
            {"coldDesert, Åh nej! du har mistet 20 point"},
            {"walledCity, Sådan! du har mogtaget 180"},
            {"Monastery, wow! du har hverken modtaget eller mistet point"},
            {"blackCave, Wwa Wa Wa! du har mistet 70 point"},
            {"hutsInTheMountain, Success! du har modtaget 60 point"} ,
            {"theWerewall, Du har mistet 80 point"},
            {"thePit, Du har mistet 50 point"},
            {"Goldmine, Tillykke du har modtaget 650 point"}};

    public int getSquare(int sumDice){
        return placesPoint[sumDice];

    }

    public String getTower(int sumDice){
        return placesPoint[sumDice] + " " + placesString[sumDice-1][1];
    }
    public int getCrater(int sumDice) {
        return placesPoint[1];
    }
    public int getPalaceGates() {
        return placesPoint[2];
    }
    public int getColdDesert() {
        return placesPoint[3];
    }
    public int getWalledCity() {
        return placesPoint[4];
    }
    public int getMonastery() {
        return placesPoint[5];
    }
    public int getBlackCave() {
        return placesPoint[6];
    }
    public int getHutsInTheMountain() {
        return placesPoint[7];
    }
    public int getTheWerewall() {
        return placesPoint[8];
    }
    public int getThePit() {
        return placesPoint[9];
    }
    public int getGoldmine() {
        return placesPoint[10];
    }
}
