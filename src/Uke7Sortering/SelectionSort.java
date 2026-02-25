package Uke7Sortering;

public class SelectionSort {
    public static <T extends Comparable<? super T>> void selectionSort(T[] a) {
        for(int i = 0; i < a.length; i++) {
            int minIndex = i;

            for(int j = i + 1; j < a.length; j++) {
                if(a[j].compareTo(a[i]) < 0) {
                    minIndex = j;
                }
            }

            T temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }
}
