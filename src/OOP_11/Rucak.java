package OOP_11;

public class Rucak {
    private String naziv_sastojaka;
    private int cena;
    private int gramaza;


    public void setNaziv_sastojaka(String naziv_sastojaka) {
        this.naziv_sastojaka = naziv_sastojaka;
    }
    public String getNaziv_sastojaka(){
        return naziv_sastojaka;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public int getCena(){
        return cena;
    }

    public void setGramaza(int gramaza) {
        this.gramaza = gramaza;
    }
    public int getGramaza(){
        return gramaza;
    }


    public void stampa(){
        System.out.println("Za pripremanje rucka potreban je " + getNaziv_sastojaka() + " u gramazi " + getGramaza() +
                " i njegova cena je " + getCena());
    }
}
