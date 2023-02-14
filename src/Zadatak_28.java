public class Zadatak_28 {
    public static void main(String[] args) {

        //Zadatak 28
//Kreirati niz od 7 clanova
//Odstampati citav niz
//Zatim odstampati prvi i poslednji clan
        int niz1[];
        niz1 = new int[7];
        niz1[0]=2;
        niz1[1]=6;
        niz1[2]=8;
        niz1[3]=10;
        niz1[4]=12;
        niz1[5]=14;
        niz1[6]=16;

            for(int i=0;i< niz1.length;i++){
                System.out.println("Clanovi niza su: " + niz1[i]);
            }
        System.out.println("Prvi clan je :" +niz1[0]);
        System.out.println("Poslednji clan je: " +niz1[6]);
    }
}
