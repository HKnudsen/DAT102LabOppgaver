package Oblig2Sort;

import java.util.Arrays;
import java.util.Random;

public class SortMethods {
    // ------- INSERTION SORT -------- //
    public static <T extends Comparable<? super T>> void insertionSort(T[] a) {
        T temp;
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            temp = a[i];
            while (j >= 0 && temp.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    // ----- SELECTION SORT ------ //
    public static <T extends Comparable<? super T>> void selectionSort(T[] a) {
        for(int i = 0; i < a.length; i++) {
            int min_index = i;

            for(int j = i + 1; j < a.length; j++) {
                if(a[j].compareTo(a[i]) < 0) {
                    min_index = j;
                }
            }

            T temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
        }
    }

    // --------------- Quicksort ---------------- //
    public static <T extends Comparable<? super T>> int partition(T[] a, int low, int high) {
        // Choose the pivot
        T pivot = a[high];

        // Index of smaller elements and indicates the right position of pivot found so far
        int i = low - 1;

        // traverse arr[low..high] and move all smaller
        // elements to the left side. Elements from low to
        // i are smaller after every iteration

        for(int j = low; j < high; j++) {
            if(a[j].compareTo(pivot) < 0) {
                i++;
                swap(a, i, j);
            }
        }

        // Move pivot after smaller elements and
        // return its position
        swap(a, i + 1, high);
        return i + 1;
    }

    public static <T extends Comparable<? super T>> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Quicksort implementation
    public static <T extends Comparable<? super T>> void quickSort(T[] a, int low, int high) {
        if (low < high) {
            // pi is the partition return index of pivot
            int pi = SortMethods.partition(a, low, high);
            System.out.println(Arrays.toString(a) + "  |  " + pi);
            // Recursion calls for smaller elements
            // And greater or equals elements
            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }
    }

    // ---------- MERGE SORT ----------- //


    static void main() {
        Integer[] test = {2,5,7,4,10,1, 66, 700, 678, 534, 11, 24, 6, 74, 89, 11111};
        //SortMethods.insertionSort(test);
        //SortMethods.selectionSort(test);
        long start = System.currentTimeMillis();
        long startN = System.nanoTime();
        SortMethods.quickSort(test,0,test.length-1);
        long end = System.currentTimeMillis();
        long endN = System.nanoTime();
        System.out.println(Arrays.toString(test));
        System.out.println("TTC: " + (endN - startN));
    }
}
