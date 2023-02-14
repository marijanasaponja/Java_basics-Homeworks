public class Zadatak_42 {
    public static void main(String[] args) {
//        obrnuti trougao
//              String zvezdica="*";
//        for( int i=0;i<5;i++){
//            System.out.printf("%5s%n", zvezdica);
//            zvezdica=zvezdica+"*";
//
//        }
//    }
    String zvezdica = "*";
    String razmak = " ";

        /*System.out.println(razmak+razmak+razmak+razmak+zvezdica);
        System.out.println(razmak+razmak+razmak+zvezdica+zvezdica);
        System.out.println(razmak+razmak+zvezdica+zvezdica+zvezdica);
        System.out.println(razmak+zvezdica+zvezdica+zvezdica+zvezdica);
        System.out.println(zvezdica+zvezdica+zvezdica+zvezdica+zvezdica);*/

        for (int i = 0; i < 5; i++) {
        for (int j = 5; j > i; j--) {
            System.out.print(razmak);
        }
        System.out.println(zvezdica);
        zvezdica = zvezdica + "*";


          }
    }
}


