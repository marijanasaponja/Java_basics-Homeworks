import java.util.Scanner;

public class Zadatak_12 {
    public static void main(String[] args) {

        //Zadatak 12
//Napisati program gde unosite ime grada (Beograd, Novi Sad, Nis, Zrenjanin, Subotica)
// i za svaki grad ispisati njegov pozivni broj.
//Takodje preko skenera upisati i broj telefona koji treba da se spoji sa pozivnim brojem
//Primer ako korisnik unese Beograd i zatim 703703 onda treba da se ispise 011703703

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv grada");
        String grad = sc.nextLine();
        String pozivniBroj = "";

        switch (grad) {
            case "Beograd":
                pozivniBroj = "011";
                break;

            case "Novi Sad":
                pozivniBroj = "021";
                break;

            case "Nis":
                pozivniBroj = "018";
                break;

            case "Zrenjanin":
                pozivniBroj = "023";
                break;

            case "Subotica":
                pozivniBroj = "024";
                break;

            default:
                System.out.println("Uneli ste nepostojeci grad");
                break;
        }

        System.out.println("Unesite broj telefona");
        String brojTelefona = sc.next();
        System.out.println("Izabrali ste broj " + pozivniBroj + brojTelefona);


    }
}