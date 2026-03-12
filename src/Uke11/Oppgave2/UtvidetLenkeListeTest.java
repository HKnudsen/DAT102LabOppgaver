package Uke11.Oppgave2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class UtvidetLenkeListeTest {


    @Test
    public void testForsteTilSiste() {
        UtvidetLenketListe<Integer> liste = new UtvidetLenketListe<Integer>();
        liste.setFirstNode(new Node<Integer>(1));
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.flyttForsteTilSiste();
        Node<Integer> current = liste.getFirstNode();
        assertEquals(4, current.data);
        current = current.next;
        assertEquals(3, current.data);
        current = current.next;
        assertEquals(2, current.data);
        current = current.next;
        assertEquals(1, current.data);
        current = current.next;
        assertEquals(5, current.data);


    }

    @Test
    public void testAnnSist() {
        UtvidetLenketListe<Integer> liste = new UtvidetLenketListe<>();
        liste.setFirstNode(new Node<Integer>(1));
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);

        assertEquals(2, liste.finnNestMinste());
    }
}
