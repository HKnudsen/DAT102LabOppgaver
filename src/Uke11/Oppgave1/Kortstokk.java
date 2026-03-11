package Uke11.Oppgave1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Kortstokk implements Iterable<Kort>{
    LinkedList<Kort> stokk = new LinkedList<>();

    public Kortstokk() {
        for (Kortfarge f : Kortfarge.values()) {
            for (Kortverdi v : Kortverdi.values()) {
                stokk.add(new Kort(f,v));
            }
        }
    }

    public void getAlleKort() {
        for(Kort k : stokk) {
            System.out.println(k);
        }
    }

    public void shuffle(){
        Collections.shuffle(stokk);
    }

    public Kort getNextCard() {
        return stokk.pop();
    }

    @Override
    public Iterator<Kort> iterator() {
        return stokk.iterator();
    }
}
