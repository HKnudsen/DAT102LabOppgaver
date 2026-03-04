package Uke10.Oppgave4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;



public class SetTest {
    @Test
    public void testErDelmengdeAv() {
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
        assertTrue(set1.erDelmengdeAv(set2));
        assertFalse(set2.erDelmengdeAv(set1));
    }

    @Test
    public void testErLik() {
        JavaSetToMengde<Integer> set1 = new JavaSetToMengde<>();
        set1.leggTil(1);
        set1.leggTil(2);
        set1.leggTil(3);
        set1.leggTil(4);
        JavaSetToMengde<Integer> set2 = new JavaSetToMengde<>();
        set2.leggTil(1);
        set2.leggTil(2);
        set2.leggTil(3);
        set2.leggTil(4);
        assertTrue(set1.erLik(set2));
        set2.fjern(4);
        assertFalse(set1.erLik(set2));

    }

    @Test
    public void testErDisjunkt() {
        JavaSetToMengde<Integer> set1 = new JavaSetToMengde<>();
        set1.leggTil(1);
        set1.leggTil(2);
        JavaSetToMengde<Integer> set2 = new JavaSetToMengde<>();
        set2.leggTil(3);
        set2.leggTil(4);
        assertTrue(set1.erDisjunkt(set2));
        set2.leggTil(1);
        assertFalse(set1.erDisjunkt(set2));
    }

    @Test
    public void testSnitt(){
        JavaSetToMengde<Integer> set1 = new JavaSetToMengde<>();
        set1.leggTil(1);
        set1.leggTil(2);
        set1.leggTil(3);
        JavaSetToMengde<Integer> set2 = new JavaSetToMengde<>();
        set2.leggTil(2);
        set2.leggTil(3);
        set2.leggTil(4);
        assertEquals(Arrays.toString(new Object[]{2,3}), Arrays.toString(set1.snitt(set2).tilTabell()));
    }

    @Test
    public void testUnion() {
        JavaSetToMengde<Integer> set1 = new JavaSetToMengde<>();
        set1.leggTil(1);
        set1.leggTil(2);
        JavaSetToMengde<Integer> set2 = new JavaSetToMengde<>();
        set2.leggTil(2);
        set2.leggTil(3);
        assertEquals(Arrays.toString(new Object[]{1,2,3}), Arrays.toString(set1.union(set2).tilTabell()));
    }

    @Test
    public void testMinus(){
        JavaSetToMengde<Integer> set1 = new JavaSetToMengde<>();
        set1.leggTil(1);
        set1.leggTil(2);
        set1.leggTil(3);
        JavaSetToMengde<Integer> set2 = new JavaSetToMengde<>();
        set2.leggTil(3);
        assertEquals(Arrays.toString(new Object[]{1,2}), Arrays.toString(set1.minus(set2).tilTabell()));
    }

}
