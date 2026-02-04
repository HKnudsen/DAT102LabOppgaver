package Uke3Lister.Oppgave6;

public class Main6 {
    // Hvor i programmet er x-en nedenfor gyldig?
    // Inne i f metoden
    static int f(int x) {
        x = 2 * x;
        return x;
    }
    static void g(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 2 * a[i];
        }
// Ikke anbefalt, men lovlig kode
        a = new double[2];
        a[0] = 1.0;
        a[1] = 2.0;
    }
    public static void main(String[] args) {
        int[] htab = {2, 7};
        int a = 4;
        int b = f(a);
// Hva er a og b nå?
        // A = 4 B = 8
        double[] tab = {2.0, 5.0};
        g(tab);
// Hva er innholdet i tab nå?
        // 2.0, 5.0
// Hvilke av disse setningene er lovlige?
        //double c1 = f(3.0);//
        double c2 = f(3);
        //int c3 = f(3.0); //Denne
        int c4 = f(3); // Denne
    }

}
