package Uke4og5StabelRekursjon.filmarkiv.klient;
import Uke4og5StabelRekursjon.filmarkiv.adt.FilmarkivADT;
import Uke4og5StabelRekursjon.filmarkiv.impl.FilmArkiv;

public class FilmarkivMain {
    public static void main(String[] args) {
        FilmarkivADT filma = new FilmArkiv(100);
        Meny meny = new Meny(filma);
        meny.start();
    }
}