package OOP_13;

public class Kamion extends MotornoVozilo {
    boolean prikolica;
    int visina;

    public Kamion(int brojTockova, int brojVrata, String boja, boolean prikolica, int visina) {
        super(brojTockova, brojVrata, boja);
        this.prikolica = prikolica;
        this.visina = visina;
    }

    public void stampa() {
        System.out.print("Kamion je " + this.visina );
        if (prikolica) {
            System.out.println(" i ima prikolicu.");
        } else {
            System.out.println(" i nema prikolicu");
        }
    }
}
