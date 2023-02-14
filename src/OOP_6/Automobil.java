package OOP_6;

public class Automobil {
    //Kreiramo klasu Automobil koja ce da ima i prazan i pun konstruktor
    //Pri kreiranju objekta mozemo da biramo koji cemo konstruktor koristiti
    //Zavisno od izbora znaci da li cemo morati da prosledjujemo sve parametre (pun konstruktor) ili ne (prazan konstruktor)
    String marka;
    String model;
    int godiste;
    int maxBrzina;

    public Automobil() {
        //Prazan konstruktor
    }

    public Automobil(String marka, String model, int godiste, int maxBrzina) {
        //Pun konstruktor
        this.marka = marka;
        this.model = model;
        this.godiste = godiste;
        this.maxBrzina = maxBrzina;
    }

    //Kreiram metodu za stampanje koju mogu da pozivam u main klasi i tako ne moram da stampam svaki atribut posebno

    public void stampa() {
        System.out.println("Auto marke " + this.marka + " i modela " + this.model + " je " + this.godiste + ". godiste." +
                " Maksimalna brzina je " + this.maxBrzina + "km/h.");
    }
}
