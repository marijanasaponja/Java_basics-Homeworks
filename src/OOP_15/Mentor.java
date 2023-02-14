package OOP_15;

public class Mentor extends QA{
    String ime_mentora;

    public Mentor(String naziv_pozicije, int plata, boolean automatsko_testiraanje, int godine_iskustva, String ime_mentora) {
        super(naziv_pozicije, plata, automatsko_testiraanje, godine_iskustva);
        this.ime_mentora = ime_mentora;
    }
    public void stampa (){
        System.out.println("Radnik na poziciji " + this.naziv_pozicije + " je imao pocetnu platu " + this.plata + " evra.");
        System.out.print("Ima " + godine_iskustva + " godine radnog iskustva i ");
        if(automatsko_testiranje){
            System.out.println("savladao je automatsko testiranje.");
        }else{
            System.out.println("nije savladao je automatsko testiranje.");
        }
        System.out.println("Glavna podrska u radu mu je njegov mentor " + this.ime_mentora + ".");
    }
}
