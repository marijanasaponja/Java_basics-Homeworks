package OOP_16;

import java.util.ArrayList;

public class QA extends IT{

    ArrayList<String> programskiJezici;

    public QA(int pocetnaPlata, int godine) {
        super(pocetnaPlata, godine);
        this.programskiJezici = new ArrayList<>();
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
                return godisnjaPlata*1.03;
            }
        }
        return godisnjaPlata*1;
    }

    public double bonus() {
        double godisnjaPlata = plata() * 12;
        return racunanjeBonusa() - godisnjaPlata;
    }

    public void stampa() {
        System.out.println("Razlika u plati je " + (plata()-pocetnaPlata) + " evra.");
        if (bonus()>0) {
            System.out.println("Zaposleni ima bonus " + bonus() + " evra.");
        } else {
            System.out.println("Zaposleni nema bonus.");
        }
        System.out.println("------------");
    }


}
