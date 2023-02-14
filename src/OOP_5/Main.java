package OOP_5;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Dragoljub", "Boranijasevic", 12345, 12);
        System.out.println("Ime: " + student1.ime);
        System.out.println("Prezime: " + student1.prezime);
        System.out.println("Broj indexa: " + student1.brojIndexa);
        System.out.println("Broj polozenih ispita: " + student1.brojPolozenihIspita);

        //Kada imamo pun konstruktor MORAJU da se salju svi parametri koji se podese
        //Kada imamo prazan konstruktor ne moraju da se salju svi podaci za atribute
        //Ali oni ce imati defaultnu vrednost null


    }
}
