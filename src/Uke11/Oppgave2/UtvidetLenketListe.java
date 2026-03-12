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

    @SuppressWarnings("unchecked")
    @Override
    public T finnNestMinste() {
        if (this.getFirstNode() == null) return null;
        if (this.getFirstNode().next == null) return (T) getFirstNode().data;
        Node<T> current = this.getFirstNode();
        T nestMinst;
        T minst;

        if (current.data.compareTo(current.next.data) < 0) {
            minst = current.data;
            nestMinst = current.next.data;
        } else if (current.data.compareTo(current.next.data) > 0) {
            nestMinst = current.data;
            minst = current.next.data;
        } else {
            minst = current.data;
            nestMinst = current.data;
        }

        current = current.next.next;

        System.out.println("Nest Minst: " + nestMinst);
        System.out.println("Minst: " + minst);

        while (current != null) {
            if (current.data.compareTo(minst) < 0) {
                nestMinst = minst;
                minst = current.data;
            } else if (current.data.compareTo(nestMinst) < 0) {
                nestMinst = current.data;
            }
            System.out.println("Nest Minst: " + nestMinst);
            System.out.println("Minst: " + minst);
            current = current.next;
        }
        return nestMinst;
    }

}
