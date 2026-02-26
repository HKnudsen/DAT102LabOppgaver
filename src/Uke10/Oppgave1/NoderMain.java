package Uke10.Oppgave1;

public class NoderMain {
    public static void main(String[] args) {
        Node<String> a = new Node<>("A");
        Node<String> b = new Node<>("B");
        Node<String> c = new Node<>("C");
        Node<String> d = new Node<>("D");
        Node<String> e = new Node<>("E");

        a.neste = c;

        a.neste = b;
        b.neste = c;
        skrivUtLenke("-->", a);
        System.out.println();

        a.neste = c;
        skrivUtLenke("-->", a);
        System.out.println();

        a.neste = d;
        d.neste = c;
        skrivUtLenke("-->", a);
        System.out.println();

        c.neste = e;
        skrivUtLenke("-->", a);
        System.out.println();
        System.out.println(antallNoderILenke(a));

        System.out.println(lenkeInneholder(a, "A"));
    }

    private static <T> void skrivUtLenke(String intro, Node<T> start){
        System.out.print(intro);
        Node<T> p = start;

        while (p != null) {
            System.out.print("[" + p.data + "|-]");
            if (p.neste != null) {
                System.out.print("-->");
            }
            p = p.neste;
        }
    }

    static int antallNoderILenke(Node<String> start) {
        int count = 0;

        while(start != null) {
            count++;
            start = start.neste;
        }
        return count;
    }

    static boolean lenkeInneholder(Node<String> start, String e) {
        while(start != null) {
            if (start.data.equals(e)) {
                return true;
            }
            start = start.neste;
        }
        return false;
    }
}
