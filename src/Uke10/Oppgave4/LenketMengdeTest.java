package Uke10.Oppgave4;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class LenketMengdeTest {
    void main() {
    }

    @Test
    public void testLeggTil() {
        LenketMengde<Integer> lenke1 = new LenketMengde<>();
        lenke1.leggTil(1);
        lenke1.leggTil(2);
        lenke1.leggTil(2);
        assertEquals(Arrays.toString(new Object[]{2,1}), Arrays.toString(lenke1.tilTabell()));
    }

    @Test
    public void testFjern(){
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
        lenke2.fjern(1);

        assertEquals(Arrays.toString(new Object[]{2}), Arrays.toString(lenke2.tilTabell()));
    }

    @Test
    public void testLeggTilAlleFra() {
        LenketMengde<Integer> tabell1 = new LenketMengde<>();
        tabell1.leggTil(1);
        tabell1.leggTil(2);

        LenketMengde<Integer> tabell2 = new LenketMengde<>();
        tabell2.leggTil(2);
        tabell2.leggTil(3);

        tabell1.leggTilAlleFra(tabell2);
        assertEquals(Arrays.toString(new Object[]{3,2,1}), Arrays.toString(tabell1.tilTabell()));
    }

    @Test
    public void testMinus() {
        LenketMengde<Integer> lenke1 = new LenketMengde<>();
        lenke1.leggTil(1);
        lenke1.leggTil(2);
        lenke1.leggTil(3);

        LenketMengde<Integer> lenke2 = new LenketMengde<>();
        lenke2.leggTil(3);

        MengdeADT<Integer> lenkeResultat = lenke1.minus(lenke2);
        assertEquals(Arrays.toString(new Object[]{1,2}), Arrays.toString(lenkeResultat.tilTabell()));
    }

    @Test
    public void testUnion() {
        LenketMengde<Integer> lenke1 = new LenketMengde<>();
        lenke1.leggTil(1);
        lenke1.leggTil(2);
        lenke1.leggTil(3);
        LenketMengde<Integer> lenke2 = new LenketMengde<>();
        lenke2.leggTil(3);
        lenke2.leggTil(4);

        assertEquals(Arrays.toString(new Object[]{1,2,3,4}), Arrays.toString(lenke1.union(lenke2).tilTabell()));
    }

    @Test
    public void testDisjunkt() {
        LenketMengde<Integer> lenke1 = new LenketMengde<>();
        lenke1.leggTil(1);
        lenke1.leggTil(2);
        lenke1.leggTil(3);
        LenketMengde<Integer> lenke2 = new LenketMengde<>();
        lenke2.leggTil(4);
        lenke2.leggTil(5);
        lenke2.leggTil(6);
        assertTrue(lenke1.erDisjunkt(lenke2));
        lenke2.leggTil(1);
        assertFalse(lenke1.erDisjunkt(lenke2));
    }

    @Test
    public void testErLik() {
        LenketMengde<Integer> lenke1 = new LenketMengde<>();
        lenke1.leggTil(1);
        lenke1.leggTil(2);
        lenke1.leggTil(3);
        LenketMengde<Integer> lenke2 = new LenketMengde<>();
        lenke2.leggTil(1);
        lenke2.leggTil(2);
        lenke2.leggTil(3);
        assertTrue(lenke1.erLik(lenke2));
        lenke2.leggTil(4);
        assertFalse(lenke1.erLik(lenke2));
    }

    @Test
    public void testErDelmengde() {
        LenketMengde<Integer> lenke1 = new LenketMengde<>();
        lenke1.leggTil(1);
        lenke1.leggTil(2);
        LenketMengde<Integer> lenke2 = new LenketMengde<>();
        lenke2.leggTil(1);
        lenke2.leggTil(2);
        lenke2.leggTil(3);
        lenke2.leggTil(4);
        assertTrue(lenke1.erDelmengdeAv(lenke2));
    }

}
