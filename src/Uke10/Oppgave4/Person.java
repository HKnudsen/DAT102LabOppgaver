package Uke10.Oppgave4;

import java.util.Objects;

public class Person {
    private String Navn;
    private String PersonNr;

    public Person(String navn, String PersonNr) {
        this.Navn = navn;
        this.PersonNr = PersonNr;
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
