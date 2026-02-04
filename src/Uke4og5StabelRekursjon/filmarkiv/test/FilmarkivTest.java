package Uke4og5StabelRekursjon.filmarkiv.test;

import Uke4og5StabelRekursjon.filmarkiv.impl.Film;
import Uke4og5StabelRekursjon.filmarkiv.impl.FilmArkiv;

import Uke4og5StabelRekursjon.filmarkiv.impl.Sjanger;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FilmarkivTest {
    @Test
    public void testFilmarkivUtvide() {
        FilmArkiv testArkiv = new FilmArkiv(2);

        testArkiv.leggTilFilm(new Film(1, "Henrik", "Henriks Film",
                2019, Sjanger.ACTION, "Henriks Selskap"));
        testArkiv.leggTilFilm(new Film(2, "Henrik", "Henriks Film",
                2019, Sjanger.ACTION, "Henriks Selskap"));
        testArkiv.leggTilFilm(new Film(3, "Henrik", "Henriks Film",
                2019, Sjanger.ACTION, "Henriks Selskap"));

        assertEquals(4, testArkiv.getLengde());
    }

    @Test
    public void testSoek() {
        FilmArkiv testArkiv = new FilmArkiv(5);

        testArkiv.leggTilFilm(new Film(1, "Henrik", "Filmen",
                2020, Sjanger.ACTION, "HenrikProduksjon"));
        testArkiv.leggTilFilm(new Film(2, "Henrik", "Filmto",
                2019, Sjanger.ACTION, "HenrikProduksjon"));
        testArkiv.leggTilFilm(new Film(3, "Kent", "Kentefilm",
                2017, Sjanger.ACTION, "KenteP"));
        testArkiv.leggTilFilm(new Film(4, "Jorda", "Sirkelen",
                2016, Sjanger.ACTION, "JoProd"));
        testArkiv.leggTilFilm(new Film(5, "Henrik", "Filmtre",
                2010, Sjanger.ACTION, "HenrikProduksjon"));

        assertEquals(3, testArkiv.soekProdusent("Henrik").length);
        assertEquals(1, testArkiv.soekTittel("Sirkelen").length);
    }

}
