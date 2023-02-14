package Domaci_11;

import java.sql.SQLOutput;
import java.util.ArrayList;

    public class Korpa {
        ArrayList<Namirnice>lista;

    public Korpa(){
        this.lista=new ArrayList<>();
    }
    public void dodavanje_liste(Namirnice x){
        lista.add(x);
    }
    public int suma(){
        int suma=0;
        for (int i=0;i< lista.size();i++){
            suma=suma + lista.get(i).getCena();
        }
        return suma;
    }
    public boolean provera(String x) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(x)) {
                return true;
            }
        }return false;
    }

    public void stampanje_provera (String n) {
        boolean provera = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNaziv().equals(n)){
                provera = true;
            }
            if(provera){
                System.out.println("Namirnica " + n + " se nalazi na spisku.");
                break;
            }else{
                System.out.println("Namirnica " + n +" se ne nalazi u spisku.");
                break;
            }
        }
    }


        public void stampa() {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getNaziv());
            }
            System.out.println("Suma svih namirnica u korpi je: " + suma() + " RSD.");

        }
    }
