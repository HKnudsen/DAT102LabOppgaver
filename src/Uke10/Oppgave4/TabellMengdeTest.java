package Uke10.Oppgave4;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TabellMengdeTest {
    static void main() {

    }
    //Må testes etter elementer er lagt til og fjernet
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
}
