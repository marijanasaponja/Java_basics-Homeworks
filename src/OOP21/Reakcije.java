package OOP21;

public class Reakcije {
    /*Kreirati klasu Reakcija koja ima tip reakcije (smajli, like, srce),
    ime i prezime korisnika koji je reagovao, getere, setere i konstruktore.*/
    private String reakcija;
    private String imePrezime;

    public Reakcije(String reakcija, String imePrezime) {
        this.reakcija = reakcija;
        this.imePrezime = imePrezime;
    }

    public String getReakcija() {
        return reakcija;
    }

    public void setReakcija(String reakcija) {
        this.reakcija = reakcija;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
}