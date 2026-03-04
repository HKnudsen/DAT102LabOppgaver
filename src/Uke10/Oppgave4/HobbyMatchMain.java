package Uke10.Oppgave4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HobbyMatchMain {
    static void main() {
        Person a = new Person("Henrik", "1", "Spille","Leke","Jobbe","Studere");
        Person b = new Person("Henrik", "2", "Spille","Like","Jazze","Studere");
        //System.out.println(a.getHobbyer());
        System.out.println(match(a,b));
        System.out.println(match(b,a));
        System.out.println(match(a,a));
    }
    static double match(Person a, Person b){
        Set<String> aHobby = a.getHobbyer();
        Set<String> bHobby = b.getHobbyer();
        Set<String> matchList = new HashSet<>(aHobby);
        matchList.addAll(bHobby);
        int countTotal = matchList.size();
        matchList.retainAll(bHobby);
        int match = matchList.size();
        return (double) match /countTotal;
    }
}
