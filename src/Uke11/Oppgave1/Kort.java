package Uke11.Oppgave1;

public record Kort(Kortfarge farge, Kortverdi verdi) {
    @Override
    public String toString() {
        return "[" + farge + " " + verdi + "]";
    }}
