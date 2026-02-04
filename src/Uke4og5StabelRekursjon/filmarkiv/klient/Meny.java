package Uke4og5StabelRekursjon.filmarkiv.klient;

import Uke4og5StabelRekursjon.filmarkiv.adt.FilmarkivADT;
import Uke4og5StabelRekursjon.filmarkiv.impl.Film;
import Uke4og5StabelRekursjon.filmarkiv.impl.Sjanger;

import java.util.Scanner;

public class Meny {
    private Tekstgrensesnitt tekstgr;
    private FilmarkivADT filmarkiv;
    public Meny(FilmarkivADT filmarkiv){
        tekstgr = new Tekstgrensesnitt();
        this.filmarkiv = filmarkiv;
    }
    public void start(){
        this.filmarkiv.leggTilFilm(new Film(1, "Henrik", "Floden", 2020, Sjanger.ACTION, "Henriks Selskap"));
        this.filmarkiv.leggTilFilm(new Film(2, "Henrik", "Floden 2", 2019, Sjanger.ACTION, "Henriks Selskap"));
        this.filmarkiv.leggTilFilm(new Film(3, "Kent", "Retts", 2018, Sjanger.DRAMA, "Kents Selskap"));
        this.filmarkiv.leggTilFilm(new Film(4, "Kent", "Test", 2023, Sjanger.HISTORY, "Kents Selskap"));

        boolean kjorer = true;

        Scanner s = new Scanner(System.in);

        while (kjorer) {
            System.out.println("1 - Legg til film");
            System.out.println("2 - Skriv ut film");
            System.out.println("3 - Slett film");
            System.out.println("4 - Søk etter filmtittel");
            System.out.println("5 - Søk etter filmprodusent");
            System.out.println("6 - Print oversikt over sjangere");
            System.out.println("\nSelect an Option: ");

            String valg = s.nextLine();
            switch (valg) {
                case "1":
                    this.filmarkiv.leggTilFilm(tekstgr.lesFilm());
                    break;
                case "2":
                    System.out.println("Oppgi filmnr: ");
                    int filmnr = s.nextInt();
                    tekstgr.skrivUtFilm(filmarkiv.finnFilm(filmnr));
                    s.nextLine();
                    break;
                case "3":
                    System.out.println("Skriv inn filmnr å slette: ");
                    tekstgr.slettFilm(this.filmarkiv, s.nextInt());
                    s.nextLine(); // Slette siste linjeskift
                    break;
                case "4":
                    System.out.println("Søk etter tittel: ");
                    tekstgr.skrivUtFilmDelstrengITittel(this.filmarkiv, s.nextLine());
                    break;
                case "5":
                    System.out.println("Søk etter produsent: ");
                    tekstgr.skrivUtFilmProdusent(this.filmarkiv, s.nextLine());
                    break;
                case "6":
                    tekstgr.skrivUtStatistikk(filmarkiv);
                    break;
                default:
                    System.out.println("Feil input!");
                    break;

            }
        }
    }
}
