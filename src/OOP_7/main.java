package OOP_7;

public class main {
    public static void main(String[] args) {

        //OOP7 - Kreirati klasu Film koja ce imati naziv, zanr i vreme trajanja
//U main metodi kreirati tri objekta koristeci prazan konstruktor
        Film film1 = new Film();
        film1.naziv = "Avatar";
        film1.zanr = "Avantura";
        film1.vreme = 190;

        Film film2 = new Film();
        film2.naziv = "Lajanje na zvezde";
        film2.zanr = "Komedija";
        film2.vreme = 100;

        Film film3 = new Film();
        film3.naziv = "Leon Professional";
        film3.zanr = "Akcija";
        film3.vreme = 115;

        System.out.println(film1.naziv);
        System.out.println(film1.zanr);
        System.out.println(film1.vreme);
        System.out.println("-----");
        System.out.println(film2.naziv);
        System.out.println(film2.zanr);
        System.out.println(film2.vreme);
        System.out.println("-----");
        System.out.println(film3.naziv);
        System.out.println(film3.zanr);
        System.out.println(film3.vreme);
        System.out.println("-----");

    }
}
