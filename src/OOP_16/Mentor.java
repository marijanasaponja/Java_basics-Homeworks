package OOP_16;

import java.util.ArrayList;

public class Mentor extends QA{

    double mentor;

    public Mentor(int pocetnaPlata, int godine,ArrayList<String> lista ,double mentor) {
        super(pocetnaPlata, godine);
        this.programskiJezici = lista;
        this.mentor = mentor;
    }

    public double plata() {
        double trenutnaPlata = pocetnaPlata;
        if (godine>5) {
            trenutnaPlata = pocetnaPlata * 1.5;
        } else if (godine>3) {
            trenutnaPlata = pocetnaPlata * 1.2;
        }
        return trenutnaPlata;
    }

    public double racunanjeBonusa() {
        double godisnjaPlata = plata() * 12;
        for (int i = 0; i < programskiJezici.size(); i++) {
            if (programskiJezici.get(i).equals("Java")) {
                return ((godisnjaPlata*1.03)+(godisnjaPlata*(1+(mentor/100)))-godisnjaPlata);
            }
        }
        return godisnjaPlata*1;
    }

    public double bonus() {
        double godisnjaPlata = plata() * 12;
        return racunanjeBonusa() - godisnjaPlata;
    }

    public void stampa() {
        System.out.println("Zaposleni ima bonus " + bonus());
    }

}
