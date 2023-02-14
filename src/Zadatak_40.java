import java.util.Scanner;

public class Zadatak_40 {
    public static void main(String[] args) {
        //nacrtaj trougao
        //preko skenera uneti broj redova

        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite broj redova:");
        int n=scanner.nextInt();
        String zvezdica="*";

        for(int i=0;i<n;i++){
            System.out.println(zvezdica);
            zvezdica=zvezdica + "*";
        }



    }
}
