package OOP_3;

public class main {
    public static void main(String[] args) {

//OOP3 - Kreirati klasu Main gde cemo kreirati objekte
//Kreirati klasu Student koja ce imati atribute Ime, Prezime, Broj indexa i Broj polozenih ispita
//Svi atributi su final osim broj polozenih ispita
//Kreirati objekat u Main klasi i promeniti mu broj polozenih ispita

        Student student1 = new Student();
        System.out.println("Ime: " + student1.ime);
        System.out.println("Prezime: " + student1.prezime);
        System.out.println("Broj indexa: " + student1.brojIndexa);
        System.out.println("Broj polozenih ispita u junu: " + student1.brojPolozenihIspita);

        student1.brojPolozenihIspita = student1.brojPolozenihIspita + 2;
        System.out.println("Broj polozenih ispita u septembru: " + student1.brojPolozenihIspita);

        //-----------------------
        System.out.println("Drugi student:");

        Student student2 = new Student();
        System.out.println("Ime: " + student2.ime);
        System.out.println("Prezime: " + student2.prezime);
        System.out.println("Broj indexa: " + student2.brojIndexa);
        System.out.println("Broj polozenih ispita u junu: " + student2.brojPolozenihIspita);
    }
}
