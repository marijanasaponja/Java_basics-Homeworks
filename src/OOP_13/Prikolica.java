package OOP_13;

public class Prikolica extends  Kamion {
    int duzina;

    public Prikolica(int brojTockova, int brojVrata, String boja, boolean prikolica, int visina, int duzina) {
        super(brojTockova, brojVrata, boja, prikolica, visina);
        this.duzina = duzina;
    }

    public void stampa() {
        System.out.println("Prikolica je dugacka " + this.duzina + " metara na kamionu koji je visok " + this.visina + " metara.");
    }
}
