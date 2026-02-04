package Uke6Rekursjon.Oppgave2;

public class Fibonacci {
    public static int beregn(int n) {
        if(n == 1) { // Basissteg
            return 1;
        }
        if (n == 0) { // Basissteg
            return 0;
        }

        return (beregn(n-1) + beregn(n-2)); // O(2^n)
    }

    public static int beregnIkkeRekursiv(int n) {
        if (n <= 1) {
            return n;
        }

        int forrige = 0; // F(0)
        int current = 1; // F(1)
        int next = 0;

        for (int i = 2; i <= n; i++) {
            next = forrige + current;
            forrige = current;
            current = next;
        }

        return current;
    }

    static void main() {
        System.out.println(beregn(4));
    }

    //O(n)
}


