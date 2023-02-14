package OOP22;

public class QualityOptimiserControl {
    /*Kreirati klasu QualityOptimiserControl koja ima samo jedan private integer atribut "internet". Kreirati konstruktor, geter i seter za atribut.
    Unutar klase kreirati metodu izvrsiAkciju koja podesava kvalitet videa.
    Kolicinu interneta unositi u MBps, a kvalitet video poredi sa Mbps. Kvalitet zvuka se podesava na prvu narednu granicu koju moze da podrzi.
            (Mbps = MBps * 8.4)
            (Ako unesete internet 20 MBps onda ce se kvalitet slike podesiti na 240)
    Granice kvaliteta slike su 144, 240, 360, 480, 720 i 1080*/

    //----144---240----360---480---720---1080
    private int internet;

    public QualityOptimiserControl(int internet) {
        this.internet = internet;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double mbps = internet * 8.4;

        if (mbps < 144) {
            videoPlayer.setKvalitetVidea(144);
        } else if (mbps < 240) {
            videoPlayer.setKvalitetVidea(240);
        } else if (mbps < 360) {
            videoPlayer.setKvalitetVidea(360);
        } else if (mbps < 480) {
            videoPlayer.setKvalitetVidea(480);
        } else if (mbps < 720) {
            videoPlayer.setKvalitetVidea(720);
        } else {
            videoPlayer.setKvalitetVidea(1080);
        }

    }
}