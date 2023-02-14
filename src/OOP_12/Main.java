package OOP_12;

public class Main {
    public static void main(String[] args) {
//        OOP12 - Kreirati klasu Proizvod koja ce imati svoj naziv i ID koji ce biti u konstruktoru
//Zatim kreirati private atribute cena i popust (boolean)
//U Main metodi kreirati objekte

        Proizvod p1 = new Proizvod("Flashdrive", 6778098);
        p1.setCena(2500);
        p1.setPopust(false);
        p1.stampa();

        Proizvod p2 = new Proizvod("Monitor", 9880);
        p2.setCena(27000);
        p2.setPopust(true);
        p2.stampa();

    }
}
