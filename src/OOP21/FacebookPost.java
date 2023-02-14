package OOP21;

import java.util.ArrayList;

public class FacebookPost {
    /*Kreirati klasu FacebookPost koja ima:
    ime i prezime korisnika koji je stavio objavu
    tekst objave
    listu reakcija
    metodu reaguj, koja dodaje reakciju u listu
    privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
    metodu stampaj koja stampa info o postu u formatu:*/

    private String imePrezime;
    private String tekstObjave;
    private ArrayList<Reakcije> reakcije;

    public FacebookPost(String imePrezime, String tekstObjave) {
        this.imePrezime = imePrezime;
        this.tekstObjave = tekstObjave;
        this.reakcije = new ArrayList<>();
    }

    public void reaguj(Reakcije r) {
        reakcije.add(r);
    }

    private int prebrojavanje(String tipReakcije) {
        int brojac = 0;
        for (int i = 0; i < reakcije.size(); i++) {
            if (reakcije.get(i).getReakcija().equals(tipReakcije)) {
                brojac++;
            }
        }
        return brojac;
    }

    public void stampaj() {
        System.out.println(this.imePrezime);
        System.out.println(this.tekstObjave);
        System.out.println("Smajli: " + prebrojavanje("smajli") + " | "
                + "Like: " + prebrojavanje("like") + " | "
                + "Srce: " + prebrojavanje("srce"));
    }

}