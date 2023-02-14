import java.util.Scanner;

public class Zadatak_10 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //Zadatak 10
//Korisnik preko skenera unosi naziv meseca
//Zavisno koji mesec unese treba da se ispise poruka koji je to mesec po redu u godini
//Ako ne unese naziv meseca program treba da napise poruku "Greska"

        System.out.println("Unesite naziv meseca :");
        String mesec=scanner.next();
        switch (mesec){

            case "Januar":
                System.out.println("1");
                break;
            case "Februar":
                System.out.println("2");
                break;
            case "Mart":
                System.out.println("3");
                break;
            case "April":
                System.out.println("4");
                break;
            case "Maj":
                System.out.println("5");
                break;
            case "Jun":
                System.out.println("6");
                break;
            case "Jul":
                System.out.println("7");
                break;
            case "Avgust":
                System.out.println("8");
                break;
            case "Septembar":
                System.out.println("9");
                break;
            case "Oktobar":
                System.out.println("10");
                break;
            case "Novembar":
                System.out.println("11");
                break;
            case "Decembar":
                System.out.println("12");
                break;
            default:
                System.out.println("Greska!");
                break;
        }








    }
}
