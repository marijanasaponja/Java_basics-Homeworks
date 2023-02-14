import java.util.ArrayList;

public class Zadatak_35 {
    public static void main(String[] args) {

        //Zadatak 35
//Kreirati string listu sa imenima ljudi koji ce vam doci na rodjendan
//Listu odstampati celu pa zatim svaki clan pojedinacno
        System.out.println("Pozvani ljudi:");
        ArrayList<String> pozvani_ljudi = new ArrayList<>();
        pozvani_ljudi.add("Mila");
        pozvani_ljudi.add("Katarina");
        pozvani_ljudi.add("Dragana");
        pozvani_ljudi.add("Dijana");
        System.out.println(pozvani_ljudi);

        for(int i=0;i<pozvani_ljudi.size();i++){
            System.out.println(pozvani_ljudi.get(i));
        }



    }
}
