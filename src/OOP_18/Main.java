package OOP_18;

public class Main {
    public static void main(String[] args) {

        Sastojak s1 = new Sastojak("so", 90);
        Sastojak s2 = new Sastojak("fusili", 280);
        Sastojak s3 = new Sastojak("spagete", 189);
        Sastojak s4 = new Sastojak("paradajz", 87);
        Sastojak s5 = new Sastojak("masline", 216);

        Pasta p1 = new Pasta();
        p1.dodavanjeSastojaka(s1);
        p1.dodavanjeSastojaka(s2);
        p1.dodavanjeSastojaka(s4);
        p1.dodavanjeSastojaka(s5);
        p1.stampanje();
        p1.brisanjeSastojaka(s1);
        p1.stampanje();


    }
}
