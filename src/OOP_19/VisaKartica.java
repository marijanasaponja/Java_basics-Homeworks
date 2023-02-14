package OOP_19;

public class VisaKartica extends PlatnaKartica{
    /*Napraviti klasu Visa kartica koja nasledjuje klasu Platna kartica
    Napraviti atribut ime i prezime za klasu
    Geter i seter za atribut
    Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.8%
    Najmanja provizija je 4$
    Implementirati metodu koja stampa karticu u formatu:
    Visa card: 7105-1579-5191-6184, 11/2024, $212 Ime i Prezime*/

    private String imePrezime;

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public VisaKartica(double suma, String brojKartice, int mesec, int godina, String imePrezime) {
        super(suma, brojKartice, mesec, godina);
        this.imePrezime = imePrezime;
    }

    public void izvrsiTransakciju(double sredstva) {
        double provizija = sredstva * 0.018;
        if (provizija<4) {
            super.izvrsiTransakciju(sredstva+4);
        } else {
            super.izvrsiTransakciju(sredstva+provizija);
        }
    }

    public void stampa() {
        System.out.print("Visa card: ");
        super.stampa();
        System.out.println(" " + this.imePrezime);
    }

}