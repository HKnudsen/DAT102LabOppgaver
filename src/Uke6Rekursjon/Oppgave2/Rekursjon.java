package Uke6Rekursjon.Oppgave2;

public class Rekursjon {
    public static int sum(int n) {
        if(n==1) {
            return 1;
        } else {
            return sum(n-1) +n ;
        }
    }


    static void main() {
        int n = 100;
        int resultat = Rekursjon.sum(n);
        System.out.println(resultat);
    }
}

// O(n)