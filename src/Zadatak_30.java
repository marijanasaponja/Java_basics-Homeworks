public class Zadatak_30 {
    public static void main(String[] args) {

        //Zadatak 30
//Kreirati niz od x clanova (birate sami koliko)
//Dodeliti im vrednosti
//Ispisati da li je prvi clan veci od poslednjeg clana

        int niz[];
        niz=new int[3];
        niz[0]=6;
        niz[1]=4;
        niz[2]=2;

        if(niz[0]>niz[niz.length-1]){
            System.out.println(niz[0] + " je vece od " + niz[niz.length-1]);
        }else{
            System.out.println(niz[0] + " je manje od " + niz[niz.length-1]);
        }
    }
}
