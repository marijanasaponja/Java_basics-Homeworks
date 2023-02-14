import java.util.ArrayList;

public class Zadatak_34 {
    public static void main(String[] args) {

        //Zadatak 34
//Kreirati opstu listu sa vasim podacima (ime, godine, visina u metrima i boolean da li ucite javu
//Listu odstampati celu pa zatim svaki clan pojedinacno

        ArrayList podaci = new ArrayList<>();

        podaci.add("Marijana");
        podaci.add(32);
        podaci.add(1.71);
        podaci.add(true);
        System.out.println(podaci);

        for (int i = 0; i < podaci.size(); i++) {
            System.out.println(podaci.get(i));
        }










    }
}
