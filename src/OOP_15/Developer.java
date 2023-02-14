package OOP_15;

public class Developer extends Firma{
    int trenutna_plata;
    String programski_jezik;

    public Developer(String naziv_pozicije, int plata, int trenutna_plata, String programski_jezik) {
        super(naziv_pozicije, plata);
        this.trenutna_plata = trenutna_plata;
        this.programski_jezik = programski_jezik;
    }
    public void stampa(){
        System.out.println("Radnik na poziciji " + this.naziv_pozicije + " je imao pocetnu platu " + plata + " evra.");
        System.out.println("Sadasnja plata mu je " + trenutna_plata + " eura, jer je vremenom savladao " + programski_jezik +
                " programski jezik.");
    }
}
