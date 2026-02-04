package Uke3Lister.Oppgave2;

public class Trekant implements Figur {
    private int sidelengde;

    public Trekant(int sidelengde) {
        this.sidelengde = sidelengde;
    }

    @Override
    public double areal() {
        return (sidelengde * sidelengde) / 2;
    }

    @Override
    public void tegn() {
        for (int i = 0; i < sidelengde; i++) {
            for (int j = sidelengde; j >= sidelengde - i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
