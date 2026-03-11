package Uke11.Oppgave1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Pokerhand implements Iterable<Kort> {
    LinkedList<Kort> hand = new LinkedList<>();

    public void insertCard(Kort k) {
        if(hand.size() < 5) {
            hand.add(k);
        }
    }

    @Override
    public Iterator<Kort> iterator() {
        return hand.iterator();
    }

    public boolean testFlush() {
        if (hand.isEmpty()) {
            return false;
        }
        Kortfarge suit = hand.get(0).farge();
        for (Kort k : hand) {
            if (k.farge() != suit) {
                return false;
            }
        }
        return true;
    }
}
