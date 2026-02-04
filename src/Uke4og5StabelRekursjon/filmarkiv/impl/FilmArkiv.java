package Uke4og5StabelRekursjon.filmarkiv.impl;

import Uke4og5StabelRekursjon.filmarkiv.adt.FilmarkivADT;

import java.util.HashMap;
import java.util.Map;

public class FilmArkiv implements FilmarkivADT {
    private Film[] tabell;
    private int antall = 0;

    public FilmArkiv(int storrelse) {
        this.tabell = new Film[storrelse];
    }

    private boolean erLedigPlass() {
         return this.antall < this.tabell.length;
    }

    private void utvidTabell() {
        Film[] nyTabell = new Film[this.tabell.length*2];
        for(int i = 0; i < this.tabell.length; i++) {
            nyTabell[i] = this.tabell[i];
        }
        this.tabell = nyTabell;
    }
    private Film[] trimTab(Film[] tab, int n) {
        Film[] nytab = new Film[n];
        int i = 0;
        while (i < n) {
            nytab[i] = tab[i];
            i++;
        }
        return nytab;
    }


    @Override
    public Film finnFilm(int nr) {
        for(Film f : this.tabell) {
            if (f.getFilmnr() == nr) {
                return f;
            }
        }
        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        if (!this.erLedigPlass()) {
            this.utvidTabell();
        }
        this.tabell[this.antall] = nyFilm;
        this.antall++;
    }

    @Override
    public boolean slettFilm(int filmnr) {
        for (int i = 0; i < this.tabell.length; i++) {
            if (this.tabell[i].getFilmnr() == filmnr) {
                this.tabell[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        int antallTreff = 0;
        Film[] filtrerteFilmer = new Film[this.antall];
        for(Film f : this.tabell) {
            if(f!=null) {
                if(f.getTittel().contains(delstreng)) {
                    filtrerteFilmer[antallTreff] = f;
                    antallTreff++;

                }
            }
        }
        return trimTab(filtrerteFilmer, antallTreff);
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        Film[] filtrerteFilmer = new Film[this.antall];
        int antallTreff = 0;
        for(Film f : this.tabell) {
            if(f!=null) {
                if (f.getProdusent().contains(delstreng)) {
                    filtrerteFilmer[antallTreff] = f;
                    antallTreff++;
                }
            }
        }
        return trimTab(filtrerteFilmer, antallTreff);
    }

    @Override
    public Map<String, Integer> antallFordeltPaSjanger() {
        Map<String, Integer> sjangerMap = new HashMap<>();

        for(Film f : this.tabell) {
            if ( f != null) {
                if (sjangerMap.containsKey(f.getSjanger())) {
                    int tall = sjangerMap.get(f.getSjanger());
                    tall++;
                    sjangerMap.put(f.getSjanger(), tall);
                } else {
                    sjangerMap.put(f.getSjanger(), 1);
                }
            }
        }
        return sjangerMap;
    }

    @Override
    public int antall(Sjanger sjanger) {
        int antallTreff = 0;
        for(Film f : this.tabell) {
            if(f!=null) {
                if (f.getSjanger().equals(sjanger.toString())){
                    antallTreff++;
                }
            }
        }
        return antallTreff;
    }

    @Override
    public int antall() {
        return this.antall;
    }

    public int getLengde() {
        return this.tabell.length;
    }

    static void main() {
        FilmArkiv testArkiv = new FilmArkiv(4);
        testArkiv.leggTilFilm(new Film(1, "Henrik", "Filmen",
                2020, Sjanger.DRAMA, "HenrikProduksjon"));
        testArkiv.leggTilFilm(new Film(2, "Henrik", "Filmto",
                2019, Sjanger.HISTORY, "HenrikProduksjon"));
        testArkiv.leggTilFilm(new Film(3, "Kent", "Kentefilm",
                2017, Sjanger.ACTION, "KenteP"));
        testArkiv.leggTilFilm(new Film(4, "Jorda", "Sirkelen",
                2016, Sjanger.ACTION, "JoProd"));
        testArkiv.leggTilFilm(new Film(5, "Henrik", "Filmtre",
                2010, Sjanger.ACTION, "HenrikProduksjon"));

        System.out.println(testArkiv.antallFordeltPaSjanger());
    }
}