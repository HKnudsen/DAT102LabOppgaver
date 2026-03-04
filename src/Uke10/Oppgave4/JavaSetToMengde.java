package Uke10.Oppgave4;
import java.util.*;

public class JavaSetToMengde<T> implements MengdeADT<T>  {
    private Set<T> set;

    public JavaSetToMengde() {
        this.set = new HashSet<>();
    }

    public Set<T> getSet() {
        return this.set;
    }

    @Override
    public boolean erTom() {
        return this.set.isEmpty();
    }

    @Override
    public boolean inneholder(T element) {
        return this.set.contains(element);
    }

    @Override
    public boolean erDelmengdeAv(MengdeADT<T> annenMengde) {
        Set<T> tempSet = new HashSet<>(List.of(annenMengde.tilTabell()));
        return tempSet.containsAll(this.set);
    }

    @Override
    public boolean erLik(MengdeADT<T> annenMengde) {
        Set<T> tempSet = new HashSet<>(List.of(annenMengde.tilTabell()));
        return this.set.containsAll(tempSet) && tempSet.containsAll(this.set);
    }

    @Override
    public boolean erDisjunkt(MengdeADT<T> annenMengde) {
        Set<T> tempSet = new HashSet<>(List.of(annenMengde.tilTabell()));
        return Collections.disjoint(this.set, tempSet);
    }

    @Override
    public MengdeADT<T> snitt(MengdeADT<T> annenMengde) {
        JavaSetToMengde<T> snitt = new JavaSetToMengde<>();
        Set<T> annenMengdeSet = new HashSet<>(List.of(annenMengde.tilTabell()));
        snitt.set = this.set;
        snitt.set.retainAll(annenMengdeSet);
        return snitt;
    }

    @Override
    public MengdeADT<T> union(MengdeADT<T> annenMengde) {
        JavaSetToMengde<T> unionSet = new JavaSetToMengde<>();
        unionSet.leggTilAlleFra(annenMengde);
        unionSet.leggTilAlleFra(this);
        return unionSet;
    }

    @Override
    public MengdeADT<T> minus(MengdeADT<T> annenMengde) {
        JavaSetToMengde<T> setResultat = new JavaSetToMengde<>();
        setResultat.leggTilAlleFra(this);
        setResultat.getSet().removeAll(List.of(annenMengde.tilTabell()));
        return setResultat;
    }

    @Override
    public void leggTil(T element) {
        this.set.add(element);

    }

    @Override
    public void leggTilAlleFra(MengdeADT<T> annenMengde) {
        this.set.addAll(List.of(annenMengde.tilTabell()));

    }

    @Override
    public T fjern(T element) {
        for (T e : this.set) {
            if(e.equals(element)) {
                this.set.remove(element);
                return e;
            }
        }
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] tilTabell() {
        return (T[]) set.toArray();
    }

    @Override
    public int antallElementer() {
        return set.size();
    }
}
