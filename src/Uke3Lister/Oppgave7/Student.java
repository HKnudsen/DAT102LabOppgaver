package Uke3Lister.Oppgave7;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int studentnr;
    private String fornavn;
    private String etternavn;
    private String studieby;

    public Student(int studentnr, String fornavn, String etternavn, String studieby) {
        this.studentnr = studentnr;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.studieby = studieby;
    }

    public int getStudentnr() {
        return studentnr;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getStudieby() {
        return studieby;
    }

    public void setStudentnr(int studentnr) {
        this.studentnr = studentnr;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setStudieby(String studieby) {
        this.studieby = studieby;
    }

    @Override
    public int compareTo(Student o) {
        /*if (this.studentnr < o.studentnr) {
            return -1;
        } else if (this.studentnr == o.studentnr) {
            return 0;
        } else {
            return 1;
        }*/
        if(this.etternavn.compareTo(o.etternavn) != 0) {
            return this.etternavn.compareTo(o.etternavn);
        } else {
            return this.fornavn.compareTo(o.fornavn);
        }
    }

    @Override
    public String toString(){
        return this.studentnr + ", " + this.fornavn + ", " + this.etternavn + ", " + this.studieby;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentnr == student.studentnr;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentnr);
    }
}
