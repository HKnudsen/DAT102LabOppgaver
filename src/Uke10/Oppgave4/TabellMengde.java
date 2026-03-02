package Uke10.Oppgave4;

import Uke4og5StabelRekursjon.filmarkiv.impl.Film;

import java.util.Arrays;

public class TabellMengde<T> implements MengdeADT<T> {
    private T[] tabell;
    private int antall;

    @SuppressWarnings("unchecked")
    public TabellMengde(int lengde){
        this.tabell = (T[]) new Object[lengde];
        this.antall = 0;
    }

    @Override
    public boolean erTom() {
        for(T e : this.tabell) {
            if(e!=null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean inneholder(T element) {
        for(T e : this.tabell) {
            if (e != null && e.equals(element)) {
                return true;
            }
        }
        return false;
    }

    //Sjekker kallende mengde er delmengde av annen mengde
    @Override
    public boolean erDelmengdeAv(MengdeADT<T> annenMengde) {
        for (T e : this.tabell) {
            if (e != null) {
                if (!annenMengde.inneholder(e)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean erLik(MengdeADT<T> annenMengde) {
        return false;
    }

    @Override
    public boolean erDisjunkt(MengdeADT<T> annenMengde) {
        return false;
    }

    @Override
    public MengdeADT<T> snitt(MengdeADT<T> annenMengde) {
        return null;
    }

    @Override
    public MengdeADT<T> union(MengdeADT<T> annenMengde) {
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MengdeADT<T> minus(MengdeADT<T> annenMengde) {
        TabellMengde<T> tempTabellMengde = new TabellMengde<>(this.antall);

        for(T e : this.tabell) {
            if(e != null && !annenMengde.inneholder(e)) {
                tempTabellMengde.leggTil(e);
            }
        }
        return tempTabellMengde;
    }

    @Override
    public void leggTil(T element) {
        if (!this.inneholder(element)) {
            if (this.antall >= this.tabell.length) {
                utvidTabell();
            }
            this.tabell[antall] = element;
            antall++;
        }
    }

    @Override
    public void leggTilAlleFra(MengdeADT<T> annenMengde) {
        for (T e : annenMengde.tilTabell()) {
            if (e != null) {
                if(!this.inneholder(e)) {
                    leggTil(e);
                }
            }
        }
    }

    @Override
    public T fjern(T element) {
        return null;
    }

    @Override
    public T[] tilTabell() {
        return trimTab(this.tabell, antall);
    }

    @Override
    public int antallElementer() {
        return this.antall;
    }

    @SuppressWarnings("unchecked")
    void utvidTabell() {
        T[] temp = this.tabell;

        this.tabell = (T[]) new Object[temp.length*2];

        for(int i = 0; i < temp.length; i++) {
            this.tabell[i] = temp[i];
        }

    }
    @SuppressWarnings("unchecked")
    private T[] trimTab(T[] tab, int n) {
        T[] nytab = (T[]) new Object[n];
        int i = 0;
        while (i < n) {
            nytab[i] = tab[i];
            i++;
        }
        return nytab;
    }
}
