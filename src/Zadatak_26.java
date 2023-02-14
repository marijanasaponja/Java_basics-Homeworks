import java.util.Scanner;

public class Zadatak_26 {
    public static void main(String[] args) {
        //Zadatak 26
// Unositi brojeve sve dok se ne unesu dva ista broja za redom

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        int x = sc.nextInt();
        int y;
        do {
            y = x;
            x = sc.nextInt();
        } while (x!=y);


    }
}