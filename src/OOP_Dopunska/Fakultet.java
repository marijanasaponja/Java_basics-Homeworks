package OOP_Dopunska;

import java.util.ArrayList;

public class Fakultet {
    ArrayList<Student> studenti;

    public Fakultet(ArrayList<Student> studenti) {
        this.studenti = studenti;
    }

    public void getStudentDepartman(String departman) {
        for(int i = 0; i<studenti.size(); i ++) {
            if(studenti.get(i).getDepartman().equalsIgnoreCase(departman)) {
                System.out.println(studenti.get(i));
            }
        }
    }

    public double prosecnaOcena(String departman) {
        double ukupno = 0;
        double brojac = 0;
        for(int i = 0; i<studenti.size(); i++) {
            if(studenti.get(i).getDepartman().equalsIgnoreCase(departman)) {
                ukupno += studenti.get(i).getProsecnaOcena();
                brojac++;
            }
        }
        return ukupno/brojac;

    }

    public void removeStudent(double ocena) {
        for(int i=studenti.size()-1; i>= 0; i--) {
            if(studenti.get(i).getProsecnaOcena() < ocena) {
                studenti.remove(studenti.get(i));

            }
        }
    }

    public boolean jeUListi(Student s) {
        boolean rez = false;
        for(int i = 0; i<studenti.size(); i++) {
            if(studenti.get(i).equals(s)) {
                rez = true;
                break;
            }
        }
        return rez;
    }

}
