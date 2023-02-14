package OOP_14;

public class Main {
    public static void main(String[] args) {

        //OOP14 - Kreirati klasu Proizvod koja ce imati atribute naziv kategorije i ID kategorije
//Kreirati klasu Telefon koja ce naslediti klasu Proizvod i imati atribut marka, model i cenu
//Kreirati klasu Televizor koja ce naslediti klasu Proizvod i imati atribut dijagonala i rezolucija


        Proizvod p1=new Proizvod("tehnika", 1);
        p1.stampa();
        Telefon t1=new Telefon("Telefon", 2, "Samsung", "A50", 300);
        t1.stampa();
        Televizor te1=new Televizor("Televizor", 3, 15, 1080);
        te1.stampa();
    }
}
