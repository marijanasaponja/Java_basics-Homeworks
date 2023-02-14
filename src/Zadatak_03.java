import java.util.Scanner;

public class Zadatak_03 {

    public static void main(String[] args) {

        //Zadatak 3
    //Preko skenera uneti dva broja i odstampati aritmeticku sredinu dva uneta broja

        Scanner scanner=new Scanner(System.in);

        System.out.println("Unesite prvi broj :");
        double prvi_broj=scanner.nextDouble();
        System.out.println("Unesite drugi broj :");
        double drugi_broj=scanner.nextDouble();
        double aritmeticka_sredina=((prvi_broj+drugi_broj)/2);
        System.out.println("Aritmeticka sredina dva broja je : " + aritmeticka_sredina);






    }
}
