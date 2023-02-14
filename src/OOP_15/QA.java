package OOP_15;

public class QA extends Firma{
    boolean automatsko_testiranje;
    int godine_iskustva;

    public QA(String naziv_pozicije, int plata, boolean automatsko_testiranje, int godine_iskustva) {
        super(naziv_pozicije, plata);
        this.automatsko_testiranje = automatsko_testiranje;
        this.godine_iskustva = godine_iskustva;
    }
    public void stampa (){
        System.out.println("Radnik na poziciji " + this.naziv_pozicije + " je imao pocetnu platu " + this.plata + " evra.");
        System.out.print("Ima " + godine_iskustva + " godine radnog iskustva i ");
        if(automatsko_testiranje){
            System.out.println("savladao je automatsko testiranje.");
        }else{
            System.out.println("nije savladao je automatsko testiranje.");
        }
    }
}
