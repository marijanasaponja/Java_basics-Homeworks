import java.util.Scanner;

public class Zadatak_07 {
    public static void main(String[] args) {

        //Zadatak 7
//Preko skenera uneti godinu
//Program proverava da li je godina prestupna i ispisuje rezultat

        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite godinu :");
        int godina=scanner.nextInt();
        if (godina > 0) {
            if (godina%4==0) {
                if (godina%100==0) {
                    if (godina%400==0) {
                        System.out.println("Godina je prestupna");
                        //Npr godina je 400
                        //Ocekivani rezultat: Godina je prestupna
                    } else {
                        System.out.println("Godine nije prestupna");
                        //Npr godina je 100
                        //Ocekivani rezultat: Godina nije prestupna
                    }
                } else {
                    System.out.println("Godina je prestupna");
                    //Npr godina je 4
                    //Ocekivani rezultat: Godina je prestupna
                }
            } else {
                System.out.println("Godina nije prestupna");
                //Npr godina je 5
                //Ocekivani rezultat: Godina nije prestupna
            }
        }


    }
}