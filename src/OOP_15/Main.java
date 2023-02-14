package OOP_15;

public class Main {
    public static void main(String[] args) {

        //OOP15 - Kreirati klasu Firma koja ce imati atribute naziv pozicije i pocetna plata
//Kreirati klasu developer koja ce naslediti klasu Firma i imati atribute trenutna plata i programski jezik
//Kreirati klasu QA koja ce naslediti klasu Firma i imati atribute boolean automatsko testiranje i godine iskustva
//Kreirati klasu Mentor koja ce naslediti klasu QA i imati atribute ime mentora

    Firma f1=new Firma("Developer", 1000);
    Firma f2=new Firma("QA", 600);

    Developer d1=new Developer(f1.naziv_pozicije, f1.plata, 1500,"Java");
    d1.stampa();
        System.out.println("--------------------------------------------------------");
    QA qa1=new QA(f2.naziv_pozicije, f2.plata, true, 3);
    qa1.stampa();
        System.out.println("---------------------------------------------------------");

    Mentor m1=new Mentor(qa1.naziv_pozicije, qa1.plata, qa1.automatsko_testiranje, qa1.godine_iskustva, "Milan Milicevic");
    m1.stampa();



    }
}
