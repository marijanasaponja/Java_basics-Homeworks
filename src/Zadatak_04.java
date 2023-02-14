import java.util.Scanner;

public class Zadatak_04 {

    public static void main(String[] args) {

        //Zadatak 4
//Preko skenera uneti broj godina korisnika
//Ako je korisnik punoletan ispisati "Mozete koristiti aplikaciju"

        Scanner scanner=new Scanner (System.in);
        System.out.println("Unesite broj godina korisnika: ");
        int broj_godina=scanner.nextInt();
        if(broj_godina>=18) {
            System.out.println("Mozete koristiti aplikaciju!");


        }



    }
}
