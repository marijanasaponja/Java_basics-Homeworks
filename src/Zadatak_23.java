import java.util.Scanner;

public class Zadatak_23 {
    public static void main(String[] args) {


//Zadatak 23
//Prikazati sumu izmedju N i M broja
//Zadatak uraditi sa sve tri petlje odvojeno (moze i u razlicite klase svaka petlja)

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi N broj");
        int N = sc.nextInt();
        System.out.println("Unesi M broj");
        int M = sc.nextInt();

        //primer N = 10
        //M = 15
        //10 + 11 + 12 + 13 + 14 + 15

        //-----N********M-------

        /*if (M>N) {
            int suma = 0;
            for (int i = N; i <= M; i++) {
                suma = suma + i;
            }
            System.out.println("Suma je " + suma);
        } else {
            System.out.println("Prvi broj je veci od drugog");
        }*/

        if (N>M) {
            //N je 15, M je 10
            int x = N;
            N=M;
            M=x;
        }

        int suma = 0;

        for (int i = N; i <= M; i++) {
            suma = suma + i;
        }

        System.out.println("Suma je " + suma);


    }
}