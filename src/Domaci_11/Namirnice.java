package Domaci_11;

public class Namirnice {
    String naziv;
        int cena;

    public Namirnice(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCena() {
        return cena;
    }
}
