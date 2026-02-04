package Uke4og5StabelRekursjon.filmarkiv.adt;

import Uke4og5StabelRekursjon.filmarkiv.impl.Film;
import Uke4og5StabelRekursjon.filmarkiv.impl.Sjanger;

public interface FilmarkivADT {
    /**
     * Hente en film med gitt filmnr fra arkivet
     * @param nr nummer på film som skal hentes.
     * @return film med gitt nr, om det ikke finnes returner null
     */
    Film finnFilm(int nr);

    /**
     * Legger til en ny film.
     * @param nyFilm er film-objektet som blir lagt til.
     */
    void leggTilFilm(Film nyFilm);

    /**
     * Sletter en film med gitt filmnr
     * @param filmnr nr på film som skal slettes
     * @return true derson en film ble slettet, false om ikke
     */
    boolean slettFilm(int filmnr);

    /**
     * Søker og henter filmer med en gitt delstreng i tittelen
     * @param delstreng som må være i tittel
     * @return tabell med filmer som har delstreng i titellen
     */
    Film[] soekTittel(String delstreng);

    /**
     * Søker og henter filmer med en gitt delstreng i filmprodusent
     * @param delstreng
     * @return liste med filmobjekter med gitt delstreng i filmprodusent
     */
    Film[] soekProdusent(String delstreng);

    /**
     * Finner antall filmer med gitt sjanger
     * @param sjanger sjangeren å telle
     * @return antall filmer med gitt sjanger
     */
    int antall(Sjanger sjanger);

    /**
     * @return antall filmer i arkivet
     */
    int antall();
}
