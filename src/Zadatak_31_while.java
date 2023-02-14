import java.util.Scanner;

public class Zadatak_31_while {
    public static void main(String[] args) {


        //Zadatak 31
//Preko skenera uneti velicinu niza, zatim preko skenera uneti sve clanove
//Odstampati samo parne brojeve u nizu


        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite velicinu niza :");
        int velicina_niza= scanner.nextInt();

        int niz1[] = new int[velicina_niza];

        for(int i=0;i<velicina_niza; i++){
            niz1[i]= scanner.nextInt();
        }

        int i=0;
        while(i<velicina_niza){
            if(niz1[i]%2==0){
                System.out.println("Parni brojevi niza su: " + niz1[i]);
            }
            i++;
        }
    }
}
