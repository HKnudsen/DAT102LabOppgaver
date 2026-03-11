package Uke11.Oppgave1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PokerhandTest {
    @Test
    public void TestPokerHandFlush() {
        Kortstokk stokk = new Kortstokk();
        Pokerhand hand = new Pokerhand();
        Pokerhand hand2 = new Pokerhand();

        for (int i = 0; i <= 5; i++) {
            hand.insertCard(stokk.getNextCard());
        }

        stokk.shuffle();

        for (int i = 0; i <= 5; i++) {
            hand2.insertCard(stokk.getNextCard());
        }


        assertTrue(hand.testFlush());
        assertFalse(hand2.testFlush());
    }
}
