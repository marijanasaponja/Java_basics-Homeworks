package OOP_Dopunska;

public class Student {
    private int brojIndeksa;
    private String departman;
    private double prosecnaOcena;

    public Student(int brojIndeksa, String departman, double prosecnaOcena) {
        this.brojIndeksa = brojIndeksa;
        this.departman = departman;
        this.prosecnaOcena = prosecnaOcena;
    }


    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public double getProsecnaOcena() {
        return prosecnaOcena;
    }

    public void setProsecnaOcena(double prosecnaOcena) {
        this.prosecnaOcena = prosecnaOcena;
    }


    @Override
    public String toString() {
        return "Student{" +
                "brojIndeksa=" + brojIndeksa +
                ", departman='" + departman + '\'' +
                ", prosecnaOcena=" + prosecnaOcena +
                '}';
    }
}
