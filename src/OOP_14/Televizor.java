package OOP_14;

public class Televizor extends Proizvod{
    int dijagonala;
    int rezolucija;

    public Televizor(String naziv_kategorije, int id_kategorije, int dijagonala, int rezolucija) {
        super(naziv_kategorije, id_kategorije);
        this.dijagonala = dijagonala;
        this.rezolucija = rezolucija;
    }
    public void stampa(){
        System.out.println("Uredjaj je iz kategorije " + this.naziv_kategorije + " i ima id " + this.id_kategorije + ".");
        System.out.println("Ima dijagonalu " + this.dijagonala + " inca i rezoluciju " + this.rezolucija + "piksela.");
    }
}
