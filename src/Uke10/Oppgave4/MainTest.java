package Uke10.Oppgave4;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    static void main() {
        TabellMengde<Integer> tabell1 = new TabellMengde<>(5);
        tabell1.leggTil(1);
        tabell1.leggTil(2);
        tabell1.leggTil(3);
        tabell1.leggTil(4);
        tabell1.leggTil(5);

        TabellMengde<Integer> tabell2 = new TabellMengde<>(3);
        tabell2.leggTil(2);
        tabell2.leggTil(4);

        System.out.println(Arrays.toString(tabell2.tilTabell()));
    }
}
