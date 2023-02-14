import java.util.Scanner;

public class Zadatak_09 {
    public static void main(String[] args) {

        //Zadatak 9
//Korisnik preko skenera unosi brojeve od 1 do 12
//Zavisno koji broj unese treba da se ispise poruka koji je to mesec po redu u godini
//Ako ne unese brojeve od 1 do 12 program treba da napise poruku "Greska"

        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite broj meseca u godini  :");
        int broj= scanner.nextInt();

        switch (broj){
            case 1:
                System.out.println("Januar");
                break;
            case 2:
                System.out.println("Februar");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Avgust");
                break;
            case 9:
                System.out.println("Septembar");
                break;
            case 10:
                System.out.println("Oktobar");
                break;
            case 11:
                System.out.println("Novembar");
                break;
            case 12:
                System.out.println("Decembar");
                break;
            default:
                System.out.println("Greska!");
                break;



        }


    }
}
