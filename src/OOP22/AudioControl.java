package OOP22;

public class AudioControl {
    /*Kreirati klasu AudioControl koja ima samo jesam boolean atribut "pojacaj". Kreirati konstruktor, geter i seter za atribut
    Unutar klase kreirati metodu izvrsiAkciju koja pomera jacinu zvuka za 1 napred ili nazad zavisno da li je prosledjeni boolean true ili false. Ne moze se pojacati na vise od 100 ili manje od 0 volume.
    Potrebna je i Main klasa za kreiranje objekata i izvrsavanje komandi*/

    private boolean pojacaj;

    public AudioControl(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    public boolean isPojacaj() {
        return pojacaj;
    }

    public void setPojacaj(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (pojacaj) {
            if (videoPlayer.getJacinaZvuka()==100) {
                videoPlayer.setJacinaZvuka(100);
            } else {
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka()+1);
            }
        } else {
            if (videoPlayer.getJacinaZvuka()==0) {
                videoPlayer.setJacinaZvuka(0);
            } else {
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka()-1);
            }
        }
    }

}