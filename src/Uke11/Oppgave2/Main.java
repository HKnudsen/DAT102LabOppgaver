package Uke11.Oppgave2;

public class Main {
    static void main() {
        UtvidetLenketListe<Integer> lenketListe = new UtvidetLenketListe<>();
        lenketListe.setFirstNode(new Node<Integer>(1));
        lenketListe.add(2);
        lenketListe.add(3);
        lenketListe.add(4);
        lenketListe.add(5);


        lenketListe.flyttForsteTilSiste();
        Node firstNode = lenketListe.getFirstNode();
        while(firstNode != null) {
            System.out.println(firstNode.data);
            firstNode = firstNode.next;
        }




        System.out.println("--------------");



    }
}
