import java.util.Scanner;

public class Domaci_01_02_Marijana_Saponja {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja :");
        int godina_rodjenja= scanner.nextInt();
        System.out.println("Unesite trenutnu godinu :");
        int trenutna_godina= scanner.nextInt();
        int broj_godina= trenutna_godina - godina_rodjenja;
        System.out.println("Broj godina: " + broj_godina);

    }
}
