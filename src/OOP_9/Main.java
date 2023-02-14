package OOP_9;

public class Main {
    public static void main(String[] args) {
        Cars auto1 = new Cars();
        auto1.setMarka("Citroen");
        auto1.setModel("C3");
        auto1.setGodiste(2022);

        System.out.println(auto1.getMarka());
        System.out.println(auto1.getModel());
        System.out.println(auto1.getGodiste());
    }
}
