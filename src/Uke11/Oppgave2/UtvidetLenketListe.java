package Uke11.Oppgave2;


public class UtvidetLenketListe<T extends Comparable<? super T>>
        extends LenketListe<T> implements UtvidetListeADT<T> {
    @Override
    public void flyttForsteTilSiste() {

        Node oldFirst = this.getFirstNode();

        if (oldFirst == null || oldFirst.next == null) return;

        Node newFirst = oldFirst.next;
        oldFirst.next = null;

        Node current = newFirst;
        while (current.next != null) {
            current = current.next;
        }

        current.next = oldFirst;
        this.setFirstNode(newFirst);

    }

    @Override
    public T finnNestMinste() {
        return null;
    }

}
