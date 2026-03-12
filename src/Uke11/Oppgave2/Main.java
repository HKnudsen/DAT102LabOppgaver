package Uke11.Oppgave2;

public class Main {
    static void main() {
        UtvidetLenketListe<Integer> lenketListe = new UtvidetLenketListe<>();
        lenketListe.setFirstNode(new Node<Integer>(1));
        lenketListe.add(2);
        lenketListe.add(3);
        //lenketListe.add(4);
        //lenketListe.add(5);


        lenketListe.finnNestMinste();








    }
}
