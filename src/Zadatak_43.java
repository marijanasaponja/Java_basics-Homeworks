
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_43 {
    public static void main(String[] args) {

        //Zadatak 43 Preko skenera uneti 4 broja u listu.
        // Ako je barem jedan broj negativan uraditi sumu svih brojeva,
        // u suprotnom pomnoziti sve brojeve.
        //Na kraju zadatka zakomentarisati testirane kombinacije

        Scanner sc = new Scanner(System.in);

        //Kreiram listu koja mora da prihvata samo Integer vrednosti
        ArrayList<Integer> lista = new ArrayList<>();

        //Koristeci skener i petlju unosim 4 broja u listu
        for (int i = 0; i < 4; i++) {
            System.out.println("Unesite broj");
            lista.add(sc.nextInt());
        }

        //Proveravam da li su vrednosti dobro unete
        System.out.println(lista);

        //Vrsim proveru da li ima negativnih brojeva
        //Tako sto kreiram jedan boolean koji ce da se promeni ako ima barem jedan negativan broj
        //Obavezno staviti break nakon ispisa, u suprotnom ce vrsiti proveru samo na poslednjem broju
        //Dovoljno je da je jedan broj negativan da znam da treba raditi sumu
        boolean provera = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < 0) {
                provera = true;
                break;
            }
        }

        int proizvod = 1;
        int suma = 0;

        //Ako ima negativnih brojeva onda je boolean = true i radi se suma
        if (provera) {
            for (int i = 0; i < lista.size(); i++) {
                suma = suma + lista.get(i);
            }
        } else {
            //U suprotnom se radi proizvod svih brojeva
            for (int i = 0; i < lista.size(); i++) {
                proizvod = proizvod * lista.get(i);
            }
        }

        //Zelim da mi se ispise samo jedna poruka, suma ili proizvod
        //Iz tog razloga provlacim ispise kroz if zavisno od provere da li ima negativnih brojeva
        if (provera) {
            System.out.println("Suma je " + suma);
        } else {
            System.out.println("Proizvod je " + proizvod);
        }

        //---------------------

        //Netacan nacin

        /*int proizvod = 1;
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > 0) {
                proizvod = proizvod * lista.get(i);
            } else {
                suma = suma + lista.get(i);
            }
        }*/

        //Netacan je zato sto moze da se desi da je sabiranje radjeno na pocetku pa kasnije proizvod
        //Zato je bitno na pocetku znati da li su svi brojevi pozitivni ili ne

        //Drugi nacin

        /*int proizvod = 1;
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(0) > 0 && lista.get(1) > 0 && lista.get(2) > 0 && lista.get(3) > 0) {
                proizvod = proizvod * lista.get(i);
            } else {
                suma = suma + lista.get(i);
            }
        }*/

        //Ali ovo je nezgodniji nacin ako lista ima mnogo clanova i treba pisati uslov za svaki poseban clan

    }
}