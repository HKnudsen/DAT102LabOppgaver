package Uke7Sortering;

import java.util.Random;



public class Main {

    public static Integer[] lagTabell(int n) {
        Random tilfeldig = new Random();
        Integer[] tabell = new Integer[n];

        for (int i = 0; i < n; i++) {
            tabell[i] = tilfeldig.nextInt();
        }
        return tabell;
    }
    static void main() {
        Integer[] tabell = Main.lagTabell(80000);
        long x = System.currentTimeMillis();
        SorterTabell.sorterVedInnsetting(tabell);
        long y = System.currentTimeMillis();
        System.out.println((y - x) + " ms : SWAP");

        Integer[] tabell2 = Main.lagTabell(80000);
        x = System.currentTimeMillis();
        SorterTabell.sorterVedInnsettingS(tabell2, 0, tabell2.length-1);
        y = System.currentTimeMillis();
        System.out.println((y-x) + " ms");

    }
}
