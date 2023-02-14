import java.sql.SQLOutput;
import java.util.Scanner;

public class Domaci_04_Zadatak_03 {
    public static void main(String[] args) {

//        3. Napraviti program gde unosite 5 brojeva i uz poruku ispisati
//        koji je bio najveci od svih njih.

        int max=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite neki broj :");
        for (int i = 0; i < 5; i++) {
            int broj = scanner.nextInt();{
           if(broj>max){
               max=broj;
                }
            }
        }
        System.out.println("Najveci broj je: "+ max);
    }
}
