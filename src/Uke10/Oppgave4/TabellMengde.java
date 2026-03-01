package Uke10.Oppgave4;

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
            if (e.equals(element)) {
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
    public MengdeADT<T> minus(MengdeADT<T> annenMengde) {
        return null;
    }

    @Override
    public void leggTil(T element) {
        if (this.antall < this.tabell.length) {
            this.tabell[antall] = element;
            antall++;
        } else {
            utvidTabell();
            this.tabell[antall] = element;
            antall++;
        }
    }

    @Override
    public void leggTilAlleFra(MengdeADT<T> annenMengde) {
        
    }

    @Override
    public T fjern(T element) {
        return null;
    }

    @Override
    public T[] tilTabell() {
        return null;
    }

    @Override
    public int antallElementer() {
        return 0;
    }

    @SuppressWarnings("unchecked")
    void utvidTabell() {
        T[] temp = this.tabell;

        this.tabell = (T[]) new Object[temp.length*2];

        for(int i = 0; i < temp.length; i++) {
            this.tabell[i] = temp[i];
        }

    }
}
