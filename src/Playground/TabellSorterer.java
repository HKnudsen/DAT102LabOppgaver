package Playground;

import java.lang.classfile.attribute.StackMapFrameInfo;
import java.util.Arrays;

public class TabellSorterer {
    public static <T extends Comparable<? super T>> void sorterVedInnsetting(T[] a) {
        for(int i = 1; i < a.length; i++) {
            T temp = a[i];
            int j = i - 1;

            while (j >= 0 && temp.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }

    // Flette sortering
    public static <T extends Comparable<? super T>> void fletteSortering(T[] a, int n){
        fletteSortering(a, 0, n - 1);
    }

    // Sorterer hele tabellen
    public static <T extends Comparable<? super T>> void fletteSortering(T[] a) {
        fletteSortering(a, 0, a.length - 1);
    }
    public static <T extends Comparable<? super T>> void fletteSortering(T[] a, int first, int last) {
        //The cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] tempArray = (T[]) new Comparable<?>[a.length];
        fletteSortering(a, tempArray, first, last);
    }

    // Sentrale biten som må kunnes på eksamen
    private static <T extends Comparable<? super T>> void fletteSortering(T[] a, T[] tempTab, int forste, int siste) {
        if (forste >= siste) {
            /*
            Gjør ingenting, men er et triks for å vise at vi har tenkte på
            basistilfelle.
             */
        } else {
            int midtpunkt = (forste + siste) / 2;
            fletteSortering(a, tempTab, forste, midtpunkt);
            fletteSortering(a, tempTab, midtpunkt + 1, siste);
            flett(a, tempTab, forste, midtpunkt, siste);
        }
    }

    private static <T extends Comparable<? super T>> void flett(T[] a, T[] tempTab, int forste, int midten, int siste) {

    }

    static void main() {
        Integer[] rekker = {4,6,3,9,11, 1};
        System.out.println(Arrays.toString(rekker));
        TabellSorterer.sorterVedInnsetting(rekker);
        System.out.println(Arrays.toString(rekker));

        Integer[] rekkeForSort = {3,7,8,1,9,2,4};
    }
}
