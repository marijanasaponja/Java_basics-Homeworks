import java.util.Scanner;

public class Zadatak_06 {
    public static void main(String[] args) {

        //Zadatak 6
//Korisnik preko skenera unosi broj godina i pol
//Ako je korisnik stariji od 18 i muskog pola treba da se ispise "Dobrodosli gospodine"
//Ako je korisnik stariji od 18 i zenskog pola treba da se ispise "Dobrodosli gospodjo"
//Na kraju programa ispisati "Kraj programa"


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godine");
        int godine = sc.nextInt();

        System.out.println("Unesite pol");
        String pol = sc.next();

        if (godine>18) {
            if (pol.equalsIgnoreCase("muski") || pol.equalsIgnoreCase("m")) {
                System.out.println("Dobrodosli gospodine");
            } else if (pol.equalsIgnoreCase("zenski") || pol.equalsIgnoreCase("z")) {
                System.out.println("Dobrodosli gospodjo");
            } else {
                System.out.println("Neispravan unos");
            }
        }

        /*else {
            Deo koda koji nema svrhu u programu zovemo mrtav kod
        }*/

        System.out.println("Kraj programa");

        /*if (pol.toUpperCase().equals("ZENSKI")) {
            //toUpperCase ce uzeti nas unos, promeniti ga u velika slova i tek onda uporediti
        }

        if (pol.toLowerCase().equals("muski")) {
            //toLowerCase ce uzeti nas unos, promeniti ga u mala slova i tek onda uporediti

        }*/


    }
}

