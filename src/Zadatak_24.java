import java.util.Scanner;

public class Zadatak_24 {
    public static void main(String[] args) {


        //Zadatak 24
//Koristeci DO WHILE petlju napisati program gde korisnik unosi svoj PIN
//Korisnik moze neogranicno puta da unosi PIN

        Scanner sc = new Scanner(System.in);
        int pin;
        do {
            System.out.println("Unesite PIN");
            pin = sc.nextInt();
        } while (pin!=1234);

        System.out.println("Kraj programa");

    }
}

