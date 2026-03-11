package Uke11.Oppgave2;


public class LenketListe<T> implements ListeADT<T> {
    private Node firstNode; // Reference to first node of chain
    private int numberOfEntries;

    @Override
    public int getNumberOfEntries() {
        return this.numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        if (this.numberOfEntries == 0) {
            return true;
        }
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public boolean contains(T anEntry) {
        return false;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        return 0;
    }

    @Override
    public boolean remove(T anEntry) {
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean add(T newEntry) {
        Node nyNode = new Node(newEntry);
        if (this.firstNode == null) {
            this.firstNode = nyNode;
        } else {
            nyNode.next = firstNode;
            this.firstNode = nyNode;

        }
        return true;
    }

    public Node getFirstNode() {
        return this.firstNode;
    }

    public void setFirstNode(Node<T> node){
        this.firstNode = node;
    }


}
