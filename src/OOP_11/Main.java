package OOP_11;

public class Main {
    public static void main(String[] args) {

        //OOP11 Kreirati klasu "Rucak" koja ce imati sve private atribute.
        // Oni su nazivSastojka, cena i gramaza. U istoj klasi kreirati metodu za stampanje,
        // a u Main klasi kreirati objekte koji su potrebni za spremanje rucka.

        Rucak pilav=new Rucak();
        pilav.setNaziv_sastojaka("kore");
        pilav.setCena(150);
        pilav.setGramaza(200);
        pilav.stampa();
    }

}
