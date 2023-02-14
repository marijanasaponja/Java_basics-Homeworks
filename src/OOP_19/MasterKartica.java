package OOP_19;

public class MasterKartica extends PlatnaKartica{
    /*Napraviti klasu Master kartica koja nasledjuje klasu Platna kartica
    Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.5%
    Napraviti metodu odrzavanja racuna koja je 2$
    Implementirati metodu koja stampa karticu u formatu:
    Master card: 7105-1579-5191-6184, 11/2024, $212*/

    public MasterKartica(int suma, String brojKartice, int mesec, int godina) {
        super(suma, brojKartice, mesec, godina);
    }

    public void odrzavanjeRacuna() {
        super.izvrsiTransakciju(2);
    }

    public void izvrsiTransakciju(double sredstva) {
        double provizija = sredstva * 0.015;
        super.izvrsiTransakciju(sredstva+provizija);
    }

    public void stampa() {
        System.out.print("Master card: ");
        super.stampa();
    }

}