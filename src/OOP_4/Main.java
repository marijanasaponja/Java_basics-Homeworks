package OOP_4;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.ime = "Dragoljub";
        student1.prezime = "Boranijasevic";
        student1.brojIndexa = 12345;
        student1.brojPolozenihIspita = 12;

        System.out.println("Ime: " + student1.ime);
        System.out.println("Prezime: " + student1.prezime);
        System.out.println("Broj indexa: " + student1.brojIndexa);
        System.out.println("Broj polozenih ispita: " + student1.brojPolozenihIspita);

        //-----------------

        Student student2 = new Student();
        student2.ime = "Ana";
        student2.prezime = "Markovic";
        student2.brojIndexa = 54321;
        student2.brojPolozenihIspita = 23;

        System.out.println("Ime: " + student2.ime);
        System.out.println("Prezime: " + student2.prezime);
        System.out.println("Broj indexa: " + student2.brojIndexa);
        System.out.println("Broj polozenih ispita: " + student2.brojPolozenihIspita);

    }
}
