import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_44 {
    public static void main(String[] args) {



                //Zadatak 44
                //Napraviti dve liste top 5 tenisera i teniserki
                //Kroz switch ako korisnik unese "ATP" onda unosi ime tenisera i vrsi se provera da li je u top 5
                //Ako jeste ispisuje se poruka "Teniser je u top 5", ako nije ispisuje se "Teniser nije u top 5"
                //Kroz switch ako korisnik unese "WTA" onda unosi ime teniserke i vrsi se provera da li je u top 5
                //Ako jeste ispisuje se poruka "Teniserka je u top 5", ako nije ispisuje se "Teniserka nije u top 5"
                //Kroz switch ako se ne unese "WTA" ili "ATP" ispisati "Pogresan unos"

                ArrayList<String> ATPlista = new ArrayList<>();
                ArrayList<String> WTAlista = new ArrayList<>();
                ATPlista.add("Carlos Alcaraz");
                ATPlista.add("Rafael Nadal");
                ATPlista.add("Casper Ruud");
                ATPlista.add("Stefanos Tsitsipas");
                ATPlista.add("Novak Djokovic");
                WTAlista.add("Iga Swiatek");
                WTAlista.add("Ons Jabeur");
                WTAlista.add("Jessica Pegula");
                WTAlista.add("Caroline Garcia");
                WTAlista.add("Aryna Sabalenka");

                Scanner sc = new Scanner(System.in);
                System.out.println("Zelite li da proverite WTA ili ATP listu?");
                String lista = sc.nextLine();

                switch (lista) {
                    case "ATP":
                        System.out.println("Unesite naziv tenisera:");
                        String ime1 = sc.nextLine();
                        //Potreban mi je boolean za proveru da li je u top 5 ili ne
                        //Ako stavim ispis da nije u "else" unutar petlje onda ce da mi ispisuje svaki put kada uslov nije zadovoljen
                        boolean provera1 = false;
                        for (int i = 0; i < ATPlista.size(); i++) {
                            if (ATPlista.get(i).equals(ime1)) {
                                provera1 = true;
                                System.out.println("Teniser je u top 5");
                                //Obavezno stavljam break da program zaustavi dalje poredjenje
                                break;
                            }
                        }
                        if (!provera1) {
                            System.out.println("Teniser nije u top 5");
                        }
                        //Na kraju svakog case-a treba staviti break kako program ne bi proveravao drugi case
                        break;

                    case "WTA":
                        System.out.println("Unesite naziv teniserke:");
                        String ime2 = sc.nextLine();
                        boolean provera2 = false;
                        for (int i = 0; i < WTAlista.size(); i++) {
                            if (WTAlista.get(i).equals(ime2)) {
                                provera2 = true;
                                System.out.println("Teniserka je u top 5");
                                break;
                            }
                        }
                        if (!provera2) {
                            System.out.println("Teniserka nije u top 5");
                        }
                        break;

                    default:
                        System.out.println("Pogresan unos");
                        break;
                }


            }
        }











