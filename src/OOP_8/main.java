package OOP_8;

public class main {
    public static void main(String[] args) {
        //OOP8 - Kreirati klasu Serija koja ce imati naziv, broj sezona i trajanje svake epizode
//U main metodi kreirati tri objekta koristeci pun konstruktor
//U klasi Serija napraviti i metodu za stampanje

        Serija serija1 = new Serija("Peaky Blinders", 6, 50);
        Serija serija2 = new Serija("Porodicno blago", 3, 45);
        Serija serija3 = new Serija("Sherlock", 4, 60);

        serija1.stampa();
        serija2.stampa();
        serija3.stampa();
    }
}
