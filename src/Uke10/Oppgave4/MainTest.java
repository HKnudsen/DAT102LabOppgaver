package Uke10.Oppgave4;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    static void main() {
        JavaSetToMengde<Integer> set1 = new JavaSetToMengde<>();
        set1.leggTil(1);
        set1.leggTil(2);
        set1.leggTil(3);
        JavaSetToMengde<Integer> set2 = new JavaSetToMengde<>();
        set2.leggTil(1);
        set2.leggTil(2);
        set2.leggTil(3);
        set2.leggTil(4);
        set2.leggTil(5);

        System.out.println(set2.tilTabell());

    }
}
