package OOP_13;

public class Main {
    public static void main(String[] args) {
        MotornoVozilo m1 = new MotornoVozilo(4, 4, "crvene");
        //m1.stampa();

        Automobil a1 = new Automobil(m1.brojTockova, m1.brojVrata, m1.boja, 4, true, "12584jhahjfv");
        //a1.stampa();

        Kamion k1 = new Kamion(m1.brojTockova, m1.brojVrata, m1.boja, false, 3);
        //k1.stampa();

        Motor mo1 = new Motor(2, 0, "plave", "sportski");
        //mo1.stampa();

        Prikolica p1 = new Prikolica(2, 0, "bele", true, k1.visina, 6);
        p1.stampa();
    }
}
