package Uke3Lister.Oppgave4;

import java.util.HashSet;
import java.util.Set;

public class Main4 {
    static void main() {
        Set<String> set = new HashSet<String>();
        set.add("Gustav");
        set.add("Henrik");
        set.add("Sander");

        Set<String> set2 = new HashSet<String>();
        set2.add("Henrik");
        set2.add("Kent");
        set2.add("Egil");

        for(String s : set) {
            System.out.println(s);
        }
        for(String s : set2) {
            System.out.println(s);
        }

        Set<String> setCopy = new HashSet<>();
        setCopy.addAll(set);


        set.retainAll(set2);
        System.out.println(setCopy);
        System.out.println("---- UNION ----");
        Set<String> setUnion = new HashSet<>();
        setUnion.addAll(setCopy);
        setUnion.addAll(set2);
        System.out.println(setUnion);
    }
}
