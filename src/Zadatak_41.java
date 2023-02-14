import java.util.Scanner;

public class Zadatak_41 {
    public static void main(String[] args) {

//Zadatak 41 - Preko skenera uneti koliko redova da ima trougao sa zvezdicama
//Preko skenera uneti i sta ce da se stampa (zvezdica ili neki drugi simbol)

        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite broj redova:");
        int n=scanner.nextInt();
        String simbol= scanner.next();
        String x=simbol;
        for(int i=1;i<n;i++){
            System.out.println(simbol);
            simbol=simbol + x;
        }




    }
}
