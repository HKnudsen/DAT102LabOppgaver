package Uke11.Oppgave2;

public interface UtvidetListeADT <T extends Comparable<? super T>> extends ListeADT<T>{
    /**
     * En metode som flytter første element i listen bakerst i listen.
     * Hvis listen er tom eller kun inneholder ett element, skal det returneres direkte.
     * Hvis listen har flere elementer skal første element flyttes bakerst.
     *
     * Eksempel:
     * Før: A -> B -> C
     * Etter: B -> C -> A
     */
    void flyttForsteTilSiste();
    /**
     * En metode som finner nest minste element i listen.
     * Hvis listen er tom eller kun inneholder ett element, skal null returneres.
     * Hvis listen har flere elementer skal det nest minste returneres.
     * Hvis de to minste elementene er like, skal denne verdien returneres.
     */
    T finnNestMinste();
}

