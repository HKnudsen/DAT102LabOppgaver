package Uke11.Oppgave1;

public class mainA {
    static void main() {
        Kortstokk stokk = new Kortstokk();

        Pokerhand hand = new Pokerhand();

        for(int i = 0; i <= 5; i++) {
            hand.insertCard(stokk.getNextCard());
        }

        for (Kort k : hand) {
            System.out.println(k);
        }

        hand.testFlush();

    }
}
