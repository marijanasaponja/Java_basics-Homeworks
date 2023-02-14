import java.util.Scanner;

public class Zadatak_19 {
    public static void main(String[] args) {


        //Zadatak 19
//Prikazati sumu brojeva do broja N koji unosite preko skenera

        int suma=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite broj n :");
        int n= scanner.nextInt();
        for(int i=0; i<=n; i++){
            suma=suma+i;
        }
        System.out.println("Suma je :" + suma);



    }
}
