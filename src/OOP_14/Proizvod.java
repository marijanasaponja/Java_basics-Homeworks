package OOP_14;

public class Proizvod {
    String naziv_kategorije;
    int id_kategorije;

    public Proizvod(String naziv_kategorije, int id_kategorije) {
        this.naziv_kategorije = naziv_kategorije;
        this.id_kategorije = id_kategorije;
    }
    public void stampa(){
        System.out.println("Proizvod je iz kategorije " + naziv_kategorije
        + " i ima ID " + id_kategorije + ".");
    }
}
