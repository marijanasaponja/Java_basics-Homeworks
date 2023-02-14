import java.util.Scanner;

public class Zadatak_46 {
    public static void main(String[] args) {

//Zadatak 46 - Napraviti main metodu i dve metode tipa int.
// U jednoj metodi staviti fiksan return 10, a u drugoj uvesti skener i uneti neki broj.
// U main metodi treba pomnoziti ove dve metode

        int proizvod=metoda1()*metoda2();
        System.out.println("Proizvod je: " + proizvod);

    }public static int metoda1(){
        int broj=10;
        return broj;
    }public static int metoda2(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite broj koji zelite da mnozite");
        int broj= scanner.nextInt();
        return broj;
    }
}
