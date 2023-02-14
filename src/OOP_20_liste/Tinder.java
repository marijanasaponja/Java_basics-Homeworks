package OOP_20_liste;

public class Tinder {
    private String ime;
    private int godine;

    public Tinder(String ime, int godine) {
        this.ime = ime;
        this.godine = godine;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    @Override
    public String toString() {
        return "Tinder{" +
                "ime='" + ime + '\'' +
                ", godine=" + godine +
                '}';
    }
}
