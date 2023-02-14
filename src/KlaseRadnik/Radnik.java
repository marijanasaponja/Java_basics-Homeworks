package KlaseRadnik;

public class Radnik {
    //OOP17 - Napraviti paket "KlaseRadnik" i dve klase - "Radnik" i "MainKlasa".
    // U klasi Radnik deklarisati public atribute jmbg (tipa long), ime i prezime (jedan string), broj dece, stepen strucne spreme i radni staz.
//Kreirati pun konstruktor za sve atribute
//Podatke odstampati van MainKlase
//Svaka metoda, sem stampanja, treba biti return type

    long jmbg;
    int brojDece;
    int stepenStrucneSpreme;
    int radniStaz;
    String imePrezime;

    public Radnik(long jmbg, int brojDece, int stepenStrucneSpreme, int radniStaz, String imePrezime) {
        this.jmbg = jmbg;
        this.brojDece = brojDece;
        this.stepenStrucneSpreme = stepenStrucneSpreme;
        this.radniStaz = radniStaz;
        this.imePrezime = imePrezime;
    }

    //Koeficijent se racuna zavisno od stepena strucne spreme preko switch-a
//Stepen strucne spreme moze biti 1,2,3,4 i koeficijent po tom redosledu je 1.03, 2.00, 2.88, 3.40

    public double koeficijent() {
        switch (stepenStrucneSpreme) {
            case 1:
                return 1.03;

            case 2:
                return 2.00;

            case 3:
                return 2.88;

            case 4:
                return 3.40;

            default:
                return 1;
        }
    }

    //Minuli rad se racuna zavisno od radnog staza.
    // Ako je radni staz kraci od 10 godina onda je minuli rad 0.05.
    // Ako je izmedju 10 i 20 onda je 0.75 i ako je duzi od 20 onda je 1.0

    public double minuliRad() {
        if (radniStaz>20) {
            return 1;
        } else if (radniStaz>10) {
            return 0.75;
        } else {
            return 0.05;
        }
    }

    //Platu racunamo tako sto ce se zbir koeficijenta i minulog rada pomnoziti sa 10 000 i na to dodati jos 2500

    public double plata() {
        return (koeficijent()+minuliRad())*10000+2500;
    }

    //Potrebno je izracunati da li je korisnik sposoban za kredit. Ako ima platu vecu od 40000 onda je true, ako ima ispod onda je false

    public boolean kredit() {
        if (plata()>40000){
            return true;
        } else {
            return false;
        }
    }

    //Potrebno je izracunati i dane godisnjeg odmora tako sto ce se broj dece pomnoziti sa 2 i na to dodati 22 dana

    public int brojSlobodnihDana() {
        return 22+(brojDece*2);
    }

    public void stampa() {
        System.out.println("Zaposleni " + this.imePrezime + ", jmbg: " + this.jmbg);
        System.out.println("Ima " + this.brojDece + " dece");
        System.out.println("Radni staz: " + radniStaz);
        System.out.println("Stepen strucne spreme: " + this.stepenStrucneSpreme);
        System.out.println("Godisnje ima " + brojSlobodnihDana() + " slobodnih dana");
        System.out.println("Ima platu " + plata());
        System.out.println("Kredit odobren? " + kredit());
    }
}
