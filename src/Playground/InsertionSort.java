package Playground;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {

    public static <T extends Comparable<? super T>> void insertSort(T[] a) {
        T temp;
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            temp = a[i];

            while (j >= 0 && temp.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                a[j] = temp;
                j--;

            }
        }
    }

    static void main() {
        Integer[] liste = {9,4,8,6,1,7,2};
        System.out.println(Arrays.toString(liste));
        InsertionSort.insertSort(liste);
        System.out.println(Arrays.toString(liste));
    }
}
