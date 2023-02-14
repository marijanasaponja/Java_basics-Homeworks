package OOP_8;

public class Serija {
    String naziv;
    int brojSezona;
    int trajanjeEpizode;

    public Serija(String naziv, int brojSezona, int trajanjeEpizode) {
        this.naziv = naziv;
        this.brojSezona = brojSezona;
        this.trajanjeEpizode = trajanjeEpizode;
    }

    public void stampa() {
        System.out.println("Serija " + this.naziv + " ima " + this.brojSezona + " sezona, gde svaka epizoda traje po " + this.trajanjeEpizode + " minuta.");
    }
}
