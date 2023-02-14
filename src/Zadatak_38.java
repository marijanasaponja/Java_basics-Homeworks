public class Zadatak_38 {
    public static void main(String[] args) {

        //Zadatak 38 - Napraviti jednocifreni niz (od 1 do 9), zatim potrebno je napraviti drugi niz
//koji ce sadrzati prva tri parna broja prvog niza

        int niz[] = {1,2,2,5,6,8,9,3,1,2,5,6};
        int noviNiz[] = new int[3];

        int x = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2==0) {
                noviNiz[x] = niz[i];
                x++;
            }
            if (x>2) {
                break;
            }
        }

        System.out.println("Prvi niz:");
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
        System.out.println("Drugi niz:");
        for (int i = 0; i < noviNiz.length; i++) {
            System.out.println(noviNiz[i]);
        }




    }
}
