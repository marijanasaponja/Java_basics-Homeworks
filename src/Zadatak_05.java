import java.util.Scanner;

public class Zadatak_05 {
    public static void main(String[] args) {


        //Zadatak 5
//Korisnik unosi broj godina i stanje na racunu
//Ako korisnik ima izmedju 20 i 30 godina treba mu dodati jos 5000 na racun

        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite broj godina :");
        int broj_godina= scanner.nextInt();
        System.out.println("Unesite stanje na racunu: ");
        int stanje_na_racunu= scanner.nextInt();
        if((broj_godina<30) && (broj_godina>=20)) {

            stanje_na_racunu=stanje_na_racunu + 5000;

        }
        System.out.println("Stanje na racunu je : "+ stanje_na_racunu);
    }
}
