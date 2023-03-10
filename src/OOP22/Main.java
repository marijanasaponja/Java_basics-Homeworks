package OOP22;

public class Main {
     /* OOP22

Kreirati klasu VideoPlayer koja ima
private atribute duzina videa, jacina zvuka, trenutno vreme videa i kvalitet videa
kreirati pun konstruktor, getere, setere i metodu koja ce da stampa u formatu
Trenutno vreme videa:
Trenutna jacina zvuka:
Trenutni kvalitet videa:
--------------------------
Kreirati klasu TimeControl koja ima samo jedan private boolean atribut "unapred".
 Kreirati konstruktor, geter i seter za atribut
Unutar klase kreirati metodu izvrsiAkciju koja pomera vreme videa unapred za 15 sekundi ako je boolean true i unazad za
15 sekundi ako je false. Ako je trenutno vreme krace od 15 sekundi i vreme se vrati unazad onda vreme treba podesiti na nulu.
Isto tako ako je ostalo manje od 15 sekundi do kraja videa i vreme se pomeri unapred onda vreme treba podesiti na maksimalni duzinu videa
--------------------------
Kreirati klasu QualityOptimiserControl koja ima samo jedan private integer atribut "internet". Kreirati konstruktor, geter i seter za atribut.
Unutar klase kreirati metodu izvrsiAkciju koja podesava kvalitet videa.
Kolicinu interneta unositi u MBps, a kvalitet video poredi sa Mbps. Kvalitet zvuka se podesava na prvu narednu granicu koju moze da podrzi.
(Mbps = MBps * 8.4)
(Ako unesete internet 20 MBps onda ce se kvalitet slike podesiti na 240)
Granice kvaliteta zvuka su 144, 240, 360, 480, 720 i 1080
--------------------------
Kreirati klasu AudioControl koja ima samo jesam boolean atribut "pojacaj". Kreirati konstruktor, geter i seter za atribut
Unutar klase kreirati metodu izvrsiAkciju koja pomera jacinu zvuka za 1 napred ili nazad zavisno da li je prosledjeni boolean true ili false. Ne moze se pojacati na vise od 100 ili manje od 0 volume.
Potrebna je i Main klasa za kreiranje objekata i izvrsavanje komandi
     */

    public static void main(String[] args) {

        VideoPlayer v1 = new VideoPlayer(120, 70, 28, 240);
        v1.stampa();
        TimeControl t1 = new TimeControl(false);
        t1.izvrsiAkciju(v1);
        //t1.izvrsiAkciju(v1);
        v1.stampa();

        AudioControl a1 = new AudioControl(true);
        for (int i = 0; i < 100; i++) {
            a1.izvrsiAkciju(v1);
        }
        v1.stampa();

        QualityOptimiserControl q1 = new QualityOptimiserControl(75);
        q1.izvrsiAkciju(v1);
        v1.stampa();


    }
}