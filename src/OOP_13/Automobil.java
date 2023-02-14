package OOP_13;

public class Automobil extends MotornoVozilo{
    int brojSedista;
    boolean volan;
    String brojSasije;

    public Automobil(int brojTockova, int brojVrata, String boja, int brojSedista, boolean volan, String brojSasije) {
        super(brojTockova, brojVrata, boja);
        this.brojSedista = brojSedista;
        this.volan = volan;
        this.brojSasije = brojSasije;
    }

    public void stampa() {
        System.out.println("Automobil ima " + this.brojTockova + " tockova.");
        System.out.println("Ima " + this.brojVrata + " vrata.");
        System.out.println("I " + this.boja + " je boje.");
        System.out.println("Pored toga ima " + this.brojSedista + " sedista.");
        System.out.println("Sasija #" + this.brojSasije);
        if (volan) {
            System.out.println("Automobil poseduje volan");
        } else {
            System.out.println("Automobil ne poseduje volan");
        }
    }
}
