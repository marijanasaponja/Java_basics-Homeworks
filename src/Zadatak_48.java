import java.util.Scanner;

public class Zadatak_48 {
    public static void main(String[] args) {

        //Zadatak 48 - U main metodi preko skenera uneti dva broja
//Napraviti metodu koja ce da sabira, oduzima, mnozi i deli te brojeve


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        int x = sc.nextInt();
        System.out.println("Unesite drugi broj");
        int y = sc.nextInt();

        int sabiranje = sabiranje(x,y);
        int oduzimanje = oduzimanje(x,y);
        int mnozenje = mnozenje(x,y);
        double deljenje = deljenje(x,y);

        System.out.println("Sabiranje: " + sabiranje);
        System.out.println("Oduzimanje: " + oduzimanje);
        System.out.println("Mnozenje: " + mnozenje);
        System.out.println("Deljenje: " + deljenje);

        //Drugi nacin stampanja:
        /*System.out.println(sabiranje(x,y));
        System.out.println(oduzimanje(x,y));
        System.out.println(mnozenje(x,y));
        System.out.println(deljenje(x,y));*/

    }

    public static int sabiranje(int x, int y) {
        return x+y;
    }

    public static int oduzimanje(int x, int y) {
        int z = x-y;
        return z;
    }

    public static int mnozenje(int a, int b) {
        int m = 0;
        if (a!=0 && b!=0) {
            m = a * b;
            return m;
        } else {
            return m;
        }
    }

    public static double deljenje(int w, int v) {
        double r = (double) w;
        double p = (double) v;

        if (r!=0 && p!=0) {
            return r/p;
        } else {
            return 0;
        }
    }

}
