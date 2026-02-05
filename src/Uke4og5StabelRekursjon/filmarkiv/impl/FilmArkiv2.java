package Uke4og5StabelRekursjon.filmarkiv.impl;

import Uke4og5StabelRekursjon.filmarkiv.adt.FilmarkivADT;

import java.util.Map;

public class FilmArkiv2 implements FilmarkivADT {
    private int antall;
    private LinearNode<Film> start;
    private LinearNode<Film> temp;

    public FilmArkiv2() {
        this.antall = 0;
    }

    @Override
    public Film finnFilm(int nr) {
        this.temp = this.start;
        while (temp != null) {
            if(temp.data.getFilmnr() == nr) {
                return temp.data;
            }
            temp = temp.neste;
        }
        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        temp = new LinearNode<Film>(nyFilm);
        temp.neste = start;
        start = temp;
        antall++;

    }

    @Override
    public boolean slettFilm(int filmnr) {
        LinearNode<Film> forrigeLink;
        this.temp = this.start;
        int count = 0;
        while (count < this.antall) {
            if(this.temp.data.getFilmnr() == filmnr) {

            }
        }
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        return new Film[0];
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        return new Film[0];
    }

    @Override
    public int antall(Sjanger sjanger) {
        return 0;
    }

    @Override
    public int antall() {
        return 0;
    }

    @Override
    public Map<String, Integer> antallFordeltPaSjanger() {
        return Map.of();
    }
}
