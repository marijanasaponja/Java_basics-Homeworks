public class Zadatak_49 {
    public static void main(String[] args) {
        //Zadatak 49 - U main metodi kreirati vise nizova brojeva
//Napraviti posebnu metodu koja ce da broji koliko niz ima parnih clanova
//Napraviti posebnu metodu koja ce da broji koliko niz ima neparnih clanova

    int[] niz1 = {2,3,55,67,32,56};
    int[] niz2 = {6,35,12,67,88,0,35,2};

        System.out.println(proveraParnih(niz1));
        System.out.println(proveraNeparnih(niz1));

        System.out.println(proveraParnih(niz2));
        System.out.println(proveraNeparnih(niz2));


}

    public static int proveraParnih(int[] niz) {
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2==0) {
                brojac++;
            }
        }
        return brojac;
    }

    public static int proveraNeparnih(int[] niz) {
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2!=0) {
                brojac++;
            }
        }
        return brojac;
    }
}


