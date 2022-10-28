package Spil;

public class Fields {
    public Fields(){}

    public int[] getPlacesPoint() {
        return placesPoint;
    }

    int[] placesPoint = {0, 0, 250,  -100,  100,  -20,  180,  0,  -70, 60,  -80, -50,  650};

    String[] placesString = {"Felt 0",
            "Felt 1",
            "- Tower, Great! You've received 250 points",
            "- Crater, Wwa wwa! you've lost 100 points",
            "- PalaceGates, Congratulations! You've received 100 point",
            "- ColdDesert, Oh no! You've lost 20 points",
            "- WalledCity, Yes! You've received 180 points",
            "- Monastery, wow! You neither lost nor gained any points",
            "- BlackCave, Wwa Wa Wa! You've lost 70 points",
            "- HutsInTheMountain, Success! You've received  60 points",
            "- TheWerewall, You've lost 80 points",
            "- ThePit, You've lost 50 points",
            "- Goldmine, Congratulations! You've received 650 points"};

    public String getSquare(int sumDice){
        return placesString[sumDice%13];
    }
}
