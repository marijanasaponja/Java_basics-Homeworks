import java.util.Scanner;

public class Zadatak_13 {
    public static void main(String[] args) {

        //Zadatak 13
//Preko skenera unosite tri broja
//Prvi broj komanduje koja akcija ce se raditi u switchu (1 - sabiranje, 2 - oduzimanje, 3 - mnozenje)
//Zavisno koja komanda se izabere ta akcija treba da se izvrsi nad druga dva unosa
//Napomena: Ako se radi oduzimanje treba oduzeti veci broj od manjeg

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj od 1 do 3");
        int x = sc.nextInt();
        System.out.println("Unesite drugi broj");
        int y = sc.nextInt();
        System.out.println("Unesite treci broj");
        int z = sc.nextInt();
        int rezultat;
        switch (x) {
            case 1:
                rezultat = y + z;
                System.out.println(rezultat);
                break;

            case 2:
                if (y > z) {
                    rezultat = y - z;
                    System.out.println(rezultat);
                } else if (z > y) {
                    rezultat = z - y;
                    System.out.println(rezultat);
                } else {
                    rezultat = y - z;
                    System.out.println(rezultat);
                }
                break;

            case 3:
                rezultat = y * z;
                System.out.println(rezultat);
                break;

            default:
                System.out.println("Pogresan unos");
                break;


        }


    }
}