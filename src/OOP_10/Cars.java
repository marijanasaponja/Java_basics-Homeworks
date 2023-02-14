package OOP_10;

public class Cars {
    private int predjeniKM;
    private String tipGoriva;
    String model;
    String marka;

    public Cars(String model, String marka) {
        this.model = model;
        this.marka = marka;
    }

    public static double racunanjePotrosnje(String gorivo) {
        if (gorivo.equals("dizel")) {
            return 10.8;
        } else {
            return 9.11;
        }
    }

    public int getPredjeniKM() {
        return predjeniKM;
    }

    public void setPredjeniKM(int predjeniKM) {
        this.predjeniKM = predjeniKM;
    }

    public String getTipGoriva() {
        return tipGoriva;
    }

    public void setTipGoriva(String tipGoriva) {
        this.tipGoriva = tipGoriva;
    }

    public void stampa() {
        System.out.println("Auto marke " + this.marka + " i modela " + this.model);
        System.out.println("Ima tip goriva " + getTipGoriva());
        System.out.println("Presao je " + getPredjeniKM());
        System.out.println("A potrosnja mu je " + racunanjePotrosnje(getTipGoriva()));
    }
}
