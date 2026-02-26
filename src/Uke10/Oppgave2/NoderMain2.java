package Uke10.Oppgave2;
import Uke10.Oppgave1.Node;

import java.util.Stack;

public class NoderMain2 {
    public static void main(String[] args) {
        // Tenker at vi skal opprette en lenke som pekes på av forste
        Node<Integer> forste = null;
        Node<Integer> ny = null;
        // Oppretter en ny node og setter denne inn først i lenken
        ny = new Node<>(4);
        ny.neste = forste;
        forste = ny;
        skrivUtLenke("forste--> ", forste); // forste--➤[4|-]
        // Oppretter en ny node og setter denne inn først i lenken
        ny = new Node<>(3);
        ny.neste = forste;
        forste = ny;
        skrivUtLenke("forste--> ", forste); // forste--➤[3|-]--➤[4|-]

        skrivUtLenke("forste--> ", forste);

        ny = new Node<>(2);
        ny.neste = forste;
        forste = ny;

        ny = new Node<>(1);
        ny.neste = forste;
        forste = ny;

        skrivUtLenke("forste-->",forste);

        System.out.println(lenkeInneholderRekursiv(forste, 4));
        skrivUtFremlengsRekursiv(forste);
        System.out.println();
        skrivUtBaklengsRekursiv(forste);
        System.out.println();
        skrivUtBaklengsMedStabel(forste);
        System.out.println();

        ny = new Node<>(3);
        ny.neste = forste;
        forste = ny;

        System.out.println(antallAvIterativ(forste, 3));
        System.out.println(antallAvRekursiv(forste, 3));



    }
    /* ---------------------------------------------------------------- */

    private static <T> void skrivUtLenke(String intro, Node<T> start) {
        System.out.print(intro);
        Node<T> p = start;
        while (p != null) {
            System.out.print("[" + p.data + "|-]");
            if (p.neste != null) {
                System.out.print("--➤");
            }
            p = p.neste;
        }
        System.out.println();
    }

    private static boolean lenkeInneholderRekursiv(Node<Integer> start, int e) {
        if (start.data == e) {
            return true;
        }
        if (start.neste == null) {
            return false;
        }

        return lenkeInneholderRekursiv(start.neste, e);
    }

    private static void skrivUtFremlengsRekursiv(Node<Integer> start) {
        if (start != null) {
            System.out.print(" " + start.data);
            if (start.neste != null) {
                skrivUtFremlengsRekursiv(start.neste);
            }
        }
    }

    private static void skrivUtBaklengsRekursiv(Node<Integer> start) {
        if(start != null) {
            if(start.neste != null) {
                skrivUtBaklengsRekursiv(start.neste);

            }
            System.out.print(start.data);
        }
    }

    private static void skrivUtBaklengsMedStabel(Node<Integer> start) {
        Stack<Integer> stack = new Stack<>();
        while(start != null) {
            stack.push(start.data);
            start = start.neste;
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    static int antallAvIterativ(Node<Integer> start, int e) {
        int count = 0;
        while(start != null) {
            if(start.data.equals(e)) {
                count++;
            }
            start = start.neste;
        }
        return count;
    }

    private static int antallAvRekursiv(Node<Integer> start, int e) {
        //Basis
        if (start.neste == null) {
            if (start.data.equals(e)) {
                return 1;
            } else {
                return 0;
            }
        }
        //Rekursiv
        int teller = start.data.equals(e) ? 1 : 0;
        return teller + antallAvRekursiv(start.neste, e);
    }

}


