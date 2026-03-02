package Uke10.Oppgave4;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TabellMengdeTest {
    @BeforeEach
    public void setup() {
        System.out.println("1");
    }

    @Test
    public void testErTom(){
        TabellMengde<Person> tabell = new TabellMengde<>(10);
        assertTrue(tabell.erTom());
    }

    @Test
    public void testErDelmengdeAv() {
        TabellMengde<Person> tabell1 = new TabellMengde<>(5);
        TabellMengde<Person> tabell2 = new TabellMengde<>(2);

        tabell1.leggTil(new Person("Henrik", "11129766666"));
        tabell1.leggTil(new Person("Henrik", "11129766661"));
        tabell1.leggTil(new Person("Henrik", "11129766662"));
        tabell1.leggTil(new Person("Henrik", "11129766663"));
        tabell1.leggTil(new Person("Henrik", "11129766664"));

        tabell2.leggTil(new Person("Henrik", "11129766666"));
        tabell2.leggTil(new Person("Henrik", "11129766661"));

        assertTrue(tabell2.erDelmengdeAv(tabell1));
        assertFalse(tabell1.erDelmengdeAv(tabell2));
    }

    @Test
    public void testMinus() {
        TabellMengde<Integer> tabell1 = new TabellMengde<>(5);
        tabell1.leggTil(1);
        tabell1.leggTil(2);
        tabell1.leggTil(3);
        tabell1.leggTil(4);
        tabell1.leggTil(5);

        TabellMengde<Integer> tabell2 = new TabellMengde<>(3);
        tabell2.leggTil(2);
        tabell2.leggTil(4);

        TabellMengde<Integer> tabellFasit = new TabellMengde<>(3);
        tabellFasit.leggTil(1);
        tabellFasit.leggTil(3);
        tabellFasit.leggTil(5);

        assertEquals(Arrays.toString(tabellFasit.tilTabell()), Arrays.toString(tabell1.minus(tabell2).tilTabell()));
    }

    @Test
    public void testTilTabell() {
        TabellMengde<Integer> tabell = new TabellMengde<>(3);
        tabell.leggTil(1);
        tabell.leggTil(2);

        assertEquals(Arrays.toString(new Object[]{1, 2}), Arrays.toString(tabell.tilTabell()));
    }
}
