import java.util.Scanner;

public class Zadatak_25 {
    public static void main(String[] args) {
        //Zadatak 25
//Koristeci WHILE petlju napraviti program gde korisnik unosi dvocifrene brojeve
//sve dok ne unese 'nedvocifren' broj
//na kraju programa ispisati prvu i drugu cifru dvocifrenog broja
//napomena: ako je dvocifren broj deljiv sa 5 onda prekinuti program


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dvocifren broj");
        int x = sc.nextInt();
        int y = x;
        while (x>9&&x<100) {
            y = x;
            x = sc.nextInt();
            if (x%5==0) {
                y = x;
                break;
            }
        }

        System.out.println("Prva cifra je " + (y/10));
        System.out.println("Druga cifra je " + (y%10));

    }
}










