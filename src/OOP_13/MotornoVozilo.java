package OOP_13;

public class MotornoVozilo {
    int brojTockova;
    int brojVrata;
    String boja;

    public MotornoVozilo(int brojTockova, int brojVrata, String boja) {
        this.brojTockova = brojTockova;
        this.brojVrata = brojVrata;
        this.boja = boja;
    }

    public void stampa() {
        System.out.println("Motorno vozilo ima " + this.brojTockova + " tockova i " + this.brojVrata + " vrata.");
        System.out.println("Vozilo je " + this.boja + " boje.");
    }
}
