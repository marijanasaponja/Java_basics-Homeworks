public class Zadatak_18 {
    public static void main(String[] args) {

        //Zadatak 18
//Prikazati proizvod neparnih brojeva od 10 do 15 -bez broja 15
//Prikazati sumu parnih brojeva od 1 do 10

        int suma=0;
        int proizvod=1;
        for(int i=10; i<15;i++){
            if(i%2==1){
                proizvod=proizvod*i;
            }
        }

        for(int i=0;i<=10; i++)
        {
            if(i%2==0){
                suma=suma+i;
            }
        }
        System.out.println("Proizvod neparnih brojeva je: "+ proizvod);
        System.out.println("Suma parnih brojeva je : " + suma);

    }
}
