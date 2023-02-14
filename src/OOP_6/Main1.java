package OOP_6;

public class Main1 {
    public static void main(String[] args) {
        //U ovoj klasi kreiram objekat pomocu praznog konstruktora
        //Znam da je prazan jer u kreiranju objekta mi ne trazi nijedan parametar

        Automobil auto = new Automobil();
        auto.marka = "BMW";
        auto.model = "318";
        auto.godiste = 2010;
        auto.maxBrzina = 220;

        //Pozivam metodu za stampu koja ce da mi prikaze objekat sa prosledjenim vrednostima atributa
        auto.stampa();

    }
}
