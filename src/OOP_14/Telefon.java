package OOP_14;

public class Telefon extends Proizvod {

    String marka;
    String model;
    int cena;

    public Telefon(String naziv_kategorije, int id_kategorije, String marka, String model, int cena) {
        super(naziv_kategorije, id_kategorije);
        this.marka = marka;
        this.model = model;
        this.cena = cena;
    }
    public void stampa(){
        System.out.println("Proizvod je iz kategorije " + naziv_kategorije + " i ima ID " + id_kategorije + ".");
        System.out.println(naziv_kategorije + " je marke " + this.marka + ", model " + this.model + ".");
        System.out.println("Cena uredjaja je " + this.cena + "evra.");
    }
}
