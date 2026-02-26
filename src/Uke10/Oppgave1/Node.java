package Uke10.Oppgave1;

public class Node<T> {
    public T data;
    public Node<T> neste = null;

    public Node(T data) {
        this.data = data;
    }
}
