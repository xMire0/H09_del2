package Spil;

public class Fields {
    public Fields(){}
    int[] placesPoint = {0, 250,  -100,  100,  -20,  180,  0,  -70, 60,  -80, -50,  650};

    String[][] placesString = {{"Tower, Godt gået! Du har modtaget 250 point"},
            {"Crater, Desværre! du har mistet 100 point"},
            {"palaceGates, Tillykke! du har modtaget 100 point"},
            {"coldDesert, Åh nej! du har mistet 20 point"},
            {"walledCity, Sådan! du har modtaget 180"},
            {"Monastery, wow! du har hverken modtaget eller mistet point"},
            {"blackCave, Wwa Wa Wa! du har mistet 70 point"},
            {"hutsInTheMountain, Success! du har modtaget 60 point"} ,
            {"theWerewall, Du har mistet 80 point"},
            {"thePit, Du har mistet 50 point"},
            {"Goldmine, Tillykke du har modtaget 650 point"}};

    public String getSquare(int sumDice){
        return placesPoint[sumDice] + " " + placesString[sumDice-1][0];
    }
}
