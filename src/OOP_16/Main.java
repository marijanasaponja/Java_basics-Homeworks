package OOP_16;

public class Main {
    public static void main(String[] args) {

        //OOP16 - Kreirati klasu IT koja ce imati atribute pocetna plata i godine u firmi
//Kreirati klasu QA koja ce naslediti klasu IT i imati atribute listu programskih jezika
//Ako je zaposlen u firmi duze od 3 godine
//onda ima povecanje od 20%, a ako je duze od 5 godina onda ima povecanje od 50%
//Ako u listi programskih jezika ima javu onda dobija godisnje bonus 3% od godisnje plate
//Kreirati klasu Mentor koja ce naslediti klasu QA i ima atribut koliko njima je zaposleni mentor
//Za svakog kome je mentor ima po 1% vise bonusa godisnje plate
//Odstampati razliku u plati u evrima i koliki je godisnji bonus u evrima
        IT it1 = new IT(1000, 2);
        IT it2 = new IT(1000, 4);
        IT it3 = new IT(1000, 6);
        IT it4 = new IT(1000, 2);

        QA qa1 = new QA(it1.pocetnaPlata, it1.godine);
        qa1.programskiJezici.add("Javascript");
        //qa1.stampa();

        /*QA qa2 = new QA(it2.pocetnaPlata, it2.godine);
        qa2.programskiJezici.add("Python");
        qa2.stampa();

        QA qa3 = new QA(it3.pocetnaPlata, it3.godine);
        qa3.programskiJezici.add("C++");
        qa3.stampa();

        QA qa4 = new QA(it4.pocetnaPlata, it4.godine);
        qa4.programskiJezici.add("Java");
        qa4.stampa();*/

        qa1.programskiJezici.add("Java");
        qa1.programskiJezici.add("Python");
        qa1.stampa();

        Mentor m1 = new Mentor(qa1.pocetnaPlata, qa1.godine, qa1.programskiJezici, 2);
        m1.stampa();




    }
}
