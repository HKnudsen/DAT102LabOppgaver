package Uke3Lister.Oppgave7;

public class Nettstudent extends Student{
    private String hjemsted;

    public Nettstudent(int studentnr, String fornavn, String etternavn, String studiested, String hjemsted) {
        super(studentnr,fornavn,etternavn,studiested);
        this.hjemsted = hjemsted;
    }

    public void setHjemsted(String hjemsted) {
        this.hjemsted = hjemsted;
    }

    public String getHjemsted() {
        return this.hjemsted;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + this.hjemsted;
    }
}
