package Uke7Sortering;

import Oblig2Sort.SortMethods;

import java.util.Arrays;

public class QuickSort {
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
}
