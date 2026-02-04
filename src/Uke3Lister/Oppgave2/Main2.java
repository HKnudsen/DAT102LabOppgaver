package Uke3Lister.Oppgave2;

public class Main2 {
    static void main() {
        Rektangel rektangel = new Rektangel(2,2);
        rektangel.areal();
        rektangel.tegn();

        Trekant trekant = new Trekant(3);
        trekant.tegn();
        System.out.println("-----------");
        Figur[] figurListe = new Figur[4];
        figurListe[0] = new Rektangel(4,5);
        figurListe[1] = new Trekant(5);
        figurListe[2] = new Trekant(2);
        figurListe[3] = new Rektangel(3, 7);

        for(Figur f: figurListe) {
            f.tegn();
        }

        double samletAreal = 0;
        for(Figur f : figurListe) {
            samletAreal += f.areal();
        }

        System.out.println(samletAreal);
    }
}
