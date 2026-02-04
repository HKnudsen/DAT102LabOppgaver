package Uke4og5StabelRekursjon.filmarkiv.klient;

import Uke4og5StabelRekursjon.filmarkiv.adt.FilmarkivADT;
import Uke4og5StabelRekursjon.filmarkiv.impl.Film;
import Uke4og5StabelRekursjon.filmarkiv.impl.Sjanger;

import java.util.Scanner;

public class Tekstgrensesnitt {

    Scanner s = new Scanner(System.in);

    public Film lesFilm(){
        System.out.println("Legg til Filmnr");
        int filmnr = s.nextInt();
        s.nextLine(); // For å bli kvitt neste linje

        System.out.println("Legg til Produsent");
        String produsent = s.nextLine();

        System.out.println("Legg til Tittel");
        String tittel = s.nextLine();

        System.out.println("Legg til Lansering");
        int lansering = s.nextInt();
        s.nextLine(); // For a bli kvitt neste linje

        System.out.println("Legg til sjanger");
        Sjanger sjanger = Sjanger.valueOf(s.nextLine());

        System.out.println("Legg til filmselskap");
        String filmselskap = s.nextLine();

        return new Film(filmnr, produsent, tittel, lansering, sjanger, filmselskap);
    }
    // Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
    public void skrivUtFilm(Film film) {
        System.out.println(film.toString());

    }
    // Skriver ut alle filmer med en spesiell delstreng i tittelen
    public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
       for (Film f : arkiv.soekTittel(delstreng)) {
           System.out.println(f.toString());
       }
    }
    // Skriver ut alle Filmer av en produsent (produsent er delstreng)
    public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
        for (Film f : arkiv.soekProdusent(delstreng)) {
            System.out.println(f.toString());
        }
    }
    // Skriver ut en enkel statistikk som inneholder antall filmer totalt
// og hvor mange det er i hver sjanger.
    public void skrivUtStatistikk(FilmarkivADT arkiv) {
        System.out.println(arkiv.antallFordeltPaSjanger());
    }

    public void slettFilm(FilmarkivADT arkiv, int filmnr) {
        Film slettetFilm = arkiv.finnFilm(filmnr);
        if (arkiv.slettFilm(filmnr)) {
            System.out.println("Slettet film: " + slettetFilm.toString());
        }
    }

}
