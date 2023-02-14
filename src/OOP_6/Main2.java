package OOP_6;

public class Main2 {
    public static void main(String[] args) {
        //U ovoj klasi kreiram objekte sa punim konstruktorom
        //Znam da je pun konstruktor jer sam prosledio parametre kada sam kreirao objekat

        Automobil auto1 = new Automobil("Fiat", "Punto", 2008, 180);
        auto1.stampa();

        Automobil auto2 = new Automobil("Toyota", "Yaris", 2006, 187);
        auto2.stampa();

        //Mogao sam u jednoj klasi da koristim kreiranje objekta sa punim i praznim
        //Ali sam odvojio u posebne klase da ne bi bilo zbunjivanja

    }
}
