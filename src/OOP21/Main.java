package OOP21;

public class Main {
    public static void main(String[] args) {

        /*
    Kreirati klasu Reakcija koja ima tip reakcije (smajli, like, srce),
    ime i prezime korisnika koji je reagovao, getere, setere i konstruktore.

    Kreirati klasu FacebookPost koja ima:
    ime i prezime korisnika koji je stavio objavu
    tekst objave
    listu reakcija
    metodu reaguj, koja dodaje reakciju u listu
    privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
    metodu stampaj koja stampa info o postu u formatu:

    Dragoljub Boranijasevic
    Test ce biti u cetvrtak
    smajli 10 | like 15 | srce 2

    Iz glavne klase instancirati par reakcija i postova i ispisati info o postovima*/

        Reakcije r1 = new Reakcije("like", "Marko Tomin");
        Reakcije r2 = new Reakcije("smajli", "Dragoljub Boranijasevic");
        Reakcije r3 = new Reakcije("srce", "Amanda Dimitrijevic");
        Reakcije r4 = new Reakcije("like", "Novak Djokovic");
        Reakcije r5 = new Reakcije("srce", "Nikola Tesla");

        FacebookPost f1 = new FacebookPost("Nikola Jokic", "Oce li neko na basket..");
        f1.reaguj(r1);
        f1.reaguj(r2);
        f1.reaguj(r3);
        f1.reaguj(r4);
        f1.reaguj(r5);
        f1.stampaj();




    }
}