package OOP_20_liste;

public class Main {
    public static void main(String[] args) {
        Tinder t1 = new Tinder("Dragoljub", 30);
        Tinder t2 = new Tinder("Marko", 22);


        Lista l1 = new Lista();
        l1.dodavanjeUListu(t1);
        l1.dodavanjeUListu(t2);
        l1.stampa1();
        l1.stampa2();
    }
}
