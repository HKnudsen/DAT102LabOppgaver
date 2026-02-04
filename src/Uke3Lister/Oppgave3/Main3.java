package Uke3Lister.Oppgave3;

import java.util.ArrayList;

public class Main3 {
    static void main() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0, 5);
        arrayList.add(1, 5);
        arrayList.add(2, 1);
        arrayList.add(3, 3);
        arrayList.add(4, 3);

        System.out.println(arrayList.get(4));

        System.out.println("Elementer i listen: " + arrayList.size());

        arrayList.set(1, 6);
        System.out.println(arrayList);

        System.out.println(arrayList.contains(1));
        System.out.println(arrayList.contains(8));

        System.out.println(arrayList.indexOf(3));
        System.out.println(arrayList.lastIndexOf(3));

        arrayList.clear();
        System.out.println(arrayList.isEmpty());
    }
}
