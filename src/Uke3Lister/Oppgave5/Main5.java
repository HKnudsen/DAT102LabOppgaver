package Uke3Lister.Oppgave5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main5 {
    static void main() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0, "er");
        arrayList.add(1, "det");
        arrayList.add(2, "alle");
        arrayList.add(3, "er");
        arrayList.add(4, "det");
        arrayList.add(5, "det");

        Map<String, Integer> map = new HashMap<>();

        for(String s : arrayList) {
            if(map.containsKey(s)) {
                int count = map.get(s);
                count++;
                map.put(s,count);
            } else {
                map.put(s,1);
            }
        }
        System.out.println(map);
        Scanner s = new Scanner(System.in);
        System.out.println("Skriv inn et ord");
        String word = s.nextLine();

        System.out.println(map.get(word));
    }
}
