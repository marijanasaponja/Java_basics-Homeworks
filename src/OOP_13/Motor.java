package OOP_13;

public class Motor extends MotornoVozilo{
    String tipMotora;

    public Motor(int brojTockova, int brojVrata, String boja, String tipMotora) {
        super(brojTockova, brojVrata, boja);
        this.tipMotora = tipMotora;
    }

    public void stampa() {
        System.out.println("Ovo je " + this.tipMotora + " tip motora.");
    }
}
