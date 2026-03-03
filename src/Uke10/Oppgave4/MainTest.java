package Uke10.Oppgave4;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    static void main() {
        TabellMengde<Integer> tabell1 = new TabellMengde<>(3);
        tabell1.leggTil(1);
        tabell1.leggTil(2);
        tabell1.leggTil(3);

        TabellMengde<Integer> tabell2 = new TabellMengde<>(2);
        tabell2.leggTil(3);
        tabell2.leggTil(4);

        MengdeADT<Integer> test = tabell1.union(tabell2);
        System.out.println(test.antallElementer());

        System.out.println(Arrays.toString(tabell2.tilTabell()));
    }
}
