package Eksamen.V24;

public class Oppgave6 {
    static void main() {
        Node n = new Node(1);
        n.neste = new Node(2);
        n.neste.neste = new Node(3);
        System.out.println(antallNoderRekursivt(n));
    }
    public Oppgave6() {

    }
    public int antallNoderIterativ(Node node) {
        int count = 0;
        while(node != null) {
            count++;
            node=node.neste;
        }
        return count;
    }

    public static int antallNoderRekursivt(Node node) {
        if(node.neste == null) {
            return 1; // Basis
        }
        return 1 + antallNoderRekursivt(node.neste);
    }
}
