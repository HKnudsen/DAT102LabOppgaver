package Oblig2Sort;

public class Person implements Comparable<Person>{
    private String fornavn;
    private String etternavn;

    public Person(String fn, String ln) {
        this.fornavn    = fn;
        this.etternavn  = ln;
    }

    @Override
    public int compareTo(Person o) {
        if (this.fornavn.compareTo(o.fornavn) > 0) {
            return 1;
        } else if (this.fornavn.compareTo(o.fornavn) < 0) {
            return - 1;
        } else {
            if(this.etternavn.compareTo(o.etternavn) > 0) {
                return 1;
            } else if (this.etternavn.compareTo(o.etternavn) < 0) {
                return - 1;
            }
        }
        return 0;
    }
}
