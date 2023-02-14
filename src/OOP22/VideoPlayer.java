package OOP22;

public class VideoPlayer {
    /*Kreirati klasu VideoPlayer koja ima
    private atribute duzina videa, jacina zvuka, trenutno vreme videa i kvalitet videa
    kreirati pun konstruktor, getere, setere i metodu koja ce da stampa u formatu
    Trenutno vreme videa:
    Trenutna jacina zvuka:
    Trenutni kvalitet videa:
            --------------------------*/

    private int duzinaVidea;
    private int jacinaZvuka;
    private int trenutnoVremeVidea;
    private double kvalitetVidea;

    public VideoPlayer(int duzinaVidea, int jacinaZvuka, int trenutnoVremeVidea, double kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.kvalitetVidea = kvalitetVidea;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public double getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(double kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public void stampa() {
        System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea);
        System.out.println("Trenutna jacina zvuka: " + this.jacinaZvuka);
        System.out.println("Trenutni kvalitet videa: " + this.kvalitetVidea);
        System.out.println("--------------");
    }
}