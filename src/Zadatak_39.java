public class Zadatak_39 {
    public static void main(String[] args) {

        //Zadatak 39 - Napisati niz koji ce se sabirati clanove do 100 (suma), kada predje 100 treba ispisati za koliko je presao
//Na primer ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
//Treba da nam ispise 80, 10, 9, 3 i onda poruka "Presli ste granicu za 2"

        int gornja_granica=100;
        int niz[]={10,20,30,45,11,1};
        int suma=0;
        int i=0;
        while(suma<gornja_granica){
            System.out.println((niz[i]));
            suma=suma+niz[i];
            i++;
        }
        System.out.println(suma);
        int preko_granice=suma-gornja_granica;
        System.out.println("Presli ste granicu za " + preko_granice);

    }
}
