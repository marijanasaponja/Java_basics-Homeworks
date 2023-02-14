package OOP_5;

public class Student {
    String ime;
    String prezime;
    int brojIndexa;
    int brojPolozenihIspita;

    //ALT + INSERT precica
    //Izabere se Constructor
    //Izaberu se svi atributi i klikne se OK
    //Konstruktor se sam kreira sa odabranim atributima

    public Student(String ime, String prezime, int brojIndexa, int brojPolozenihIspita) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndexa = brojIndexa;
        this.brojPolozenihIspita = brojPolozenihIspita;
    }
}
