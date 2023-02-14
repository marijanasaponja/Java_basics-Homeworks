import java.util.Scanner;

public class Domaci_05_Zadatak_1_While {
    public static void main(String[] args) {


//        1. Napraviti program gde cete uneti neki broj i kao rezultat vratiti
//        zbir svih njegovih prethodnih brojeva. (napraviti sa for i while primere)

        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite neki broj:");
        int n= scanner.nextInt();
        int suma=0;
        int i=0;
        while(i<n){
            suma=suma+i;
            i++;
        }
        System.out.println("Suma je: " + suma);




    }
}
