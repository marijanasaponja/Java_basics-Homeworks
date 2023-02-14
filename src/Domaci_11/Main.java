package Domaci_11;

public class Main {
    public static void main(String[] args) {
//        Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.
//        Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
//                Osim konstuktora definisati:
//        - metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
//        - metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
//                - metoda stampaj() - istampace sve namirnice iz liste.
//        U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.

        Namirnice n1=new Namirnice("hleb", 70);
        Namirnice n2=new Namirnice("mleko", 170);
        Namirnice n3=new Namirnice("ulje", 230);

        Korpa k1=new Korpa();
        k1.dodavanje_liste(n1);
        k1.dodavanje_liste(n2);
        k1.dodavanje_liste(n3);
        k1.stampa();
        k1.stampanje_provera("med");
    }
}
