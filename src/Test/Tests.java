package Test;
import Spil.Dice;
import Spil.Account;
import Spil.Player;
import Spil.Game;
import Spil.Fields;
import Spil.Playerlist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Assert.*;

public class Tests {
    @Test

    //We are testing for what happens when balance is less than 0, we expect it to be equal to 0 which is exactly what happens.
    public void checkBalanceLessThan3000(){
        Player player1 = new Player("player1");
        player1.account.setAccount(-1);
        assertEquals(0, player1.account.getAccount());
    }
    @Test

    //We are testing for what happens when balance is more than 3000, we expect it to be equal to 3000 which is exactly what happens.
    public void checkBalanceOver3000(){
        Player player1 = new Player("player1");
        player1.account.setAccount(3001);
        assertEquals(3000, player1.account.getAccount());
    }

    @Test
    //We are testing for when the dice is rolled and a random number is recieved, and as seen below that does indeed happen.
    public void checkRandomDiceThrow() {
        Player player1 = new Player("player1");
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int res = dice.roll(2);
            assertTrue(res >= 2);
            assertTrue(res <= 12);
        }
    }

    @Test
    //We are testing for when the player hits inside the given parameters allowed for the player.
    public void checkFieldMovement(){
        Player player1 = new Player("player1");
        player1.setPosition(5);
        assertEquals(5, player1.getPosition());
    }

    @Test
    //We are testing for when the player hits outside the given parameters allowed for the player.
    public void checkFieldMovementOutsideTheAllowedPlace(){
        Player player1 = new Player("player1");
        player1.setPosition(13);
        assertEquals(0, player1.getPosition());
    }

}

