public class Zadatak_47 {
    public static void main(String[] args) {

        //Zadatak 47 - U main metodi pozvati metodu gde prosledjujete ime i godiste, a druga metoda stampa
        //ime korisnika i koliko ima godina

        prosledjivanje("Kristijan", 1976);
    }

    public static void prosledjivanje(String a, int x) {
        int godiste = 2022 - x;

        System.out.println("Korisnik se zove " + a + " i ima " + godiste + " godina");
    }
}