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

        Node<Integer> first = lenke1.getFirst();

        while (first!=null) {
            System.out.println(first.data);
            first = first.neste;
        }

    }
}
