package Uke10.Oppgave4;

public class LenketMengde<T> implements MengdeADT<T> {
    private Node<T> first;
    private int antall;

    public LenketMengde(T data) {
        this.first = new Node<T>(data);
        antall = 1;
    }

    public LenketMengde() {
        this.antall = 0;
    }

    public Node<T> getFirst() {
        return this.first;
    }

    @Override
    public boolean erTom() {
        return this.antall == 0;
    }

    @Override
    public boolean inneholder(T element) {
        Node<T> current = this.first;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.neste;
        }
        return false;
    }

    @Override
    public boolean erDelmengdeAv(MengdeADT<T> annenMengde) {
        return false;
    }

    @Override
    public boolean erLik(MengdeADT<T> annenMengde) {
        return false;
    }

    @Override
    public boolean erDisjunkt(MengdeADT<T> annenMengde) {
        return false;
    }

    @Override
    public MengdeADT<T> snitt(MengdeADT<T> annenMengde) {
        return null;
    }

    // Må bruke til tabell
    @Override
    public MengdeADT<T> union(MengdeADT<T> annenMengde) {
        LenketMengde<T> union = new LenketMengde<>();
        Node<T> annenMengdeCurrent = annenMengde.get
        while (annenMengde.)
        return null;
    }

    @Override
    public MengdeADT<T> minus(MengdeADT<T> annenMengde) {
        MengdeADT<T> minusMengde = new LenketMengde<>();
        Node<T> current = this.first;
        while (current != null) {
            if(!annenMengde.inneholder(current.data)) {
                minusMengde.leggTil(current.data);
            }
            current = current.neste;
        }
        return minusMengde;
    }

    @Override
    public void leggTil(T element) {
        if (!this.inneholder(element)) {
            Node<T> nyNode = new Node<>(element);
            nyNode.neste = this.first;
            this.first = nyNode;
            this.antall++;
        }
    }

    @Override
    public void leggTilAlleFra(MengdeADT<T> annenMengde) {
        for (T e : annenMengde.tilTabell()) {
            this.leggTil(e);
        }
    }

    @Override
    public T fjern(T element) {
        Node<T> current = first;
        Node<T> previous = null;

        while (current != null) {
            if (java.util.Objects.equals(current.data, element)) {
                if (previous == null) {
                    first = current.neste;
                } else {
                    previous.neste = current.neste;
                }
                antall--;
                return current.data;
            }
            previous = current;
            current = current.neste;
        }
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] tilTabell() {
        int count = 0;
        T[] returTabell = (T[]) new Object[this.antall];
        Node<T> current = this.first;

        while (current != null) {
            returTabell[count] = current.data;
            count++;
            current = current.neste;
        }
        return returTabell;
    }

    @Override
    public int antallElementer() {
        return this.antall;
    }
}
