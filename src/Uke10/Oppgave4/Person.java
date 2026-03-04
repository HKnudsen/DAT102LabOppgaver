package Uke10.Oppgave4;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Person {
    private String Navn;
    private String PersonNr;
    private Set<String> hobbyer = new HashSet<>();

    public Person(String navn, String PersonNr, String ... hobbyer) {
        this.Navn = navn;
        this.PersonNr = PersonNr;
        this.hobbyer.addAll(List.of(hobbyer));
    }

    public void setNavn(String navn) {
        this.Navn = navn;
    }

    public String getNavn() {
        return this.Navn;
    }

    public void setPersonNr(String personNr) {
        this.PersonNr = personNr;
    }

    public String getPersonNr() {
        return this.PersonNr;
    }

    public Set<String> getHobbyer() {
        return this.hobbyer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(PersonNr, person.PersonNr);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(PersonNr);
    }
}
