import java.util.Scanner;

public class Zadatak_20 {
    public static void main(String[] args) {

        //Zadatak 20
//Kreirati program za login gde korisnik moze najvise 3 puta da unese username i password
//Ako tri puta pogresi unos ispisati "Neuspesan login. Pokusajte ponovo."

        Scanner scanner=new Scanner(System.in);
        String username="Marijana";
        String password="123M";

        for(int i=0 ;i<3 ;i++){
            String user= scanner.nextLine();
            String sifra= scanner.nextLine();
            if(((!user.equals(username)) && ((!sifra.equals(password)) ))) {
                System.out.println("Neuspesan login. Pokusajte ponovo.");
            }
            else{
                System.out.println("Uspesno ste ulogovani!");
            }
        }

    }
}
