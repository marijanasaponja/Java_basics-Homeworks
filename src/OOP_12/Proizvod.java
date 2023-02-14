package OOP_12;

public class Proizvod {
    String naziv;
    int ID;
    private double cena;
    private boolean popust;

    public Proizvod(String naziv, int ID) {
        this.naziv = naziv;
        this.ID = ID;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public boolean isPopust() {
        return popust;
    }

    public void setPopust(boolean popust) {
        this.popust = popust;
    }

    public void stampa() {
        System.out.println("Proizvod " + this.naziv + " ima ID: " + this.ID);
        System.out.print("Proizvod kosta " + getCena() + " dinara i ");
        if (isPopust()) {
            System.out.println("na popustu je.");
        } else {
            System.out.println("nije na popustu.");
        }
    }

}
