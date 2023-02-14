package OOP_Dopunska;

import java.util.ArrayList;

public class GlavnaKlasa {
    public static void main(String [] arg) {

        Student s1 = new Student(105, "informatika", 10.58);
        Student s2 = new Student(125, "matematika", 8.58);
        Student s3 = new Student(107, "informatika", 9.58);

        ArrayList<Student> studenti = new ArrayList<>();

        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);

        Fakultet f = new Fakultet(studenti);

        f.getStudentDepartman("informatika");
        System.out.println("Prosecna ocena departmana za informatiku je: " + f.prosecnaOcena("informatika"));

        f.removeStudent(8);
        System.out.println(studenti);
    }
}