package Uke10.Oppgave4;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    static void main() {
        LenketMengde<Integer> lenke1 = new LenketMengde<>();
        lenke1.leggTil(1);
        lenke1.leggTil(2);
        lenke1.leggTil(3);
        lenke1.leggTil(4);
        lenke1.leggTil(5);

        lenke1.fjern(3);

        assertEquals(Arrays.toString(new Object[]{5,4,2,1}), Arrays.toString(lenke1.tilTabell()));

        LenketMengde<Integer> lenke2 = new LenketMengde<>();
        lenke2.leggTil(1);
        lenke2.leggTil(2);
        System.out.println(lenke2.antallElementer());
        lenke2.fjern(2);

        System.out.println(lenke2.antallElementer());
    }
}
