public class Zadatak_37 {
    public static void main(String[] args) {

        //Zadatak 37 - Napraviti niz i prikazati njegov najveci i najmanji clan

        int niz[] = {1, -8, 18, 11, 7, 0, -17};

        int min = niz[0];
        int max = niz[0];

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < min) {
                min = niz[i];
            }
        }

        System.out.println("Najmanji broj je " + min);
        System.out.println("Najveci broj je " + max);
    }
}
