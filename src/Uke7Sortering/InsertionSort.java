package Uke7Sortering;

public class InsertionSort {
    public static <T extends Comparable<? super T>> void insertionSort(T[] a) {
        for (int i = 1; i < a.length; i++) {
            T temp = a[i];
            int j = i - 1;
            while (j >= 0 && temp.compareTo(a[j]) < 0) {
                a[j+1] = a[j];
                j--;
            }
            a[j] = temp;
        }
    }
}
