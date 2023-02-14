import java.util.Scanner;

public class Zadatak_17 {
    public static void main(String[] args) {

        //Zadatak17
//Korisnik najvise 5 puta moze da pogodi "bingo" broj
//Ako unese 0 prikaze se poruka "Bingo!" i izlazi iz petlje

        Scanner scanner= new Scanner(System.in);
        for(int i=0; i<5; i++){
            int broj= scanner.nextInt();
            if(broj==0){
                System.out.println("Bingo");
                break;
            }
        }

        }

}
