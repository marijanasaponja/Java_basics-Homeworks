import java.util.Scanner;

public class Zadatak_22 {
    public static void main(String[] args) {

        //Zadatak 22
//Koristeci WHILE petlju napraviti program koji racuna profit prethodnih dana preko unetih brojeva
// sve dok korisnik ne unese 0

        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite profit: ");
        int profit= scanner.nextInt();
        int suma=profit;

        while(profit!=0){
            profit= scanner.nextInt();
            suma=suma+profit;
        }
        System.out.println(suma);
    }
}
