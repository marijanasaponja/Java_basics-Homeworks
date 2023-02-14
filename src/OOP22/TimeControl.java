package OOP22;

public class TimeControl {
    /*Kreirati klasu TimeControl koja ima samo jedan private boolean atribut "unapred".
    Kreirati konstruktor, geter i seter za atribut
    Unutar klase kreirati metodu izvrsiAkciju koja pomera vreme videa unapred za 15 sekundi ako je boolean true i unazad za
15 sekundi ako je false. Ako je trenutno vreme krace od 15 sekundi i vreme se vrati unazad onda vreme treba podesiti na nulu.
    Isto tako ako je ostalo manje od 15 sekundi do kraja videa i vreme se pomeri unapred onda vreme treba podesiti na maksimalni duzinu videa
--------------------------*/

    private boolean unapred;

    public TimeControl(boolean unapred) {
        this.unapred = unapred;
    }

    public boolean isUnapred() {
        return unapred;
    }

    public void setUnapred(boolean unapred) {
        this.unapred = unapred;
    }
    //------------------------------------------------
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (unapred) {
            if (videoPlayer.getDuzinaVidea() - videoPlayer.getTrenutnoVremeVidea() < 15) {
                videoPlayer.setTrenutnoVremeVidea(videoPlayer.getDuzinaVidea());
            } else {
                videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea()+15);
            }
        } else {
            if (videoPlayer.getTrenutnoVremeVidea() - 15 < 0) {
                videoPlayer.setTrenutnoVremeVidea(0);
            } else {
                videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea()-15);

            }
        }
    }

}