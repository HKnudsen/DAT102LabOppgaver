package Uke3Lister.Oppgave7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main7 {
    static void main() {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Henrik", "Knudsen","Bergen"));
        studentList.add(new Student(1, "Kent", "Ong","Oslo"));
        studentList.add(new Student(2, "Atle", "Mere","Stavanger"));
        studentList.add(new Student(5, "Kim", "Ong","Bergen"));
        studentList.add(new Student(4, "Markus", "Nilsen","Førde"));
        studentList.add(new Nettstudent(1, "Henrik", "Knudsen" , "Bergen", "Bergen"));

        Collections.sort(studentList);
        System.out.println(studentList);

        //-------------------------------
        ArrayList<Nettstudent> nettListe = new ArrayList<>();
        nettListe.add(new Nettstudent(1, "Henrik", "Knudsen" , "Bergen", "Bergen"));
        nettListe.add(new Nettstudent(1, "Henrik", "Knudsen" , "Bergen", "Oslo"));
        nettListe.add(new Nettstudent(1, "Henrik", "Knudsen" , "Bergen", "Førde"));
        nettListe.add(new Nettstudent(1, "Henrik", "Knudsen" , "Bergen", "Bergen"));

        Set<String> set = new HashSet<>();
        for(Nettstudent n : nettListe) {
            set.add(n.getHjemsted());
        }
        System.out.println(set);
    }
}
