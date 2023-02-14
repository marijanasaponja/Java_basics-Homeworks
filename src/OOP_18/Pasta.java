package OOP_18;

import java.util.ArrayList;

public class Pasta {
    ArrayList<Sastojak> listaSastojaka;

    public Pasta() {
        this.listaSastojaka = new ArrayList<>();
    }

    public void dodavanjeSastojaka(Sastojak sastojak) {
        listaSastojaka.add(sastojak);
    }

    public void brisanjeSastojaka(Sastojak sastojak) {
        for (int i = 0; i < listaSastojaka.size(); i++) {
            if (listaSastojaka.get(i).equals(sastojak)) {
                listaSastojaka.remove(sastojak);
            }
        }
    }

    public int sumaPaste() {
        int suma = 0;
        for (int i = 0; i < listaSastojaka.size(); i++) {
            suma = suma + listaSastojaka.get(i).getCena();
        }
        return suma;
    }

    public void stampanje() {
        System.out.println("Sastojci paste su: ");
        for (int i = 0; i < listaSastojaka.size(); i++) {
            System.out.println(listaSastojaka.get(i).getNaziv());
        }
        System.out.println("Ukupna cena paste je " + sumaPaste());
    }
}
