import java.util.Scanner;

public class Zadatak_11 {
    public static void main(String[] args) {

//        Napraviti program koji prilikom unosa nekog meseca(String),
//        vraca koliko taj mesec ima dana.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite mesec :");
        String mesec= scanner.next();
        switch(mesec){
            case "Januar", "Mart", "Maj", "Juli", "Avgust", "Oktobar", "Decembar":
                System.out.println("Mesec ima 31 dan");
                break;
            case "April", "Jun", "Septembar", "Novembar":
                System.out.println("Mesec ima 30 dana");
                break;
            case "Februar":
                System.out.println("Mesec ima 28 dana");
                break;
            default:
                System.out.println("Greska!");
                break;






        }





    }
}
