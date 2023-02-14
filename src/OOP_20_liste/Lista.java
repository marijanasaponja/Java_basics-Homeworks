package OOP_20_liste;

import java.util.ArrayList;

public class Lista {
    ArrayList<Tinder> lista;

    public Lista() {
        this.lista = new ArrayList<Tinder>();
    }

    public void dodavanjeUListu(Tinder elementZaDodavanje) {
        lista.add(elementZaDodavanje);
    }

    public void stampa1() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).getGodine() + " ");
            System.out.println(lista.get(i).getIme());
        }
    }

    public void stampa2() {
        System.out.println(lista);
    }
}
