package semaine05;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-08-31
 */
public class TestConversions {
    public static void main(String[] args) {
        TestConversions testeur= new TestConversions();
//        testeur.testerConversionsImplicites();
        testeur.testerConversionsExplicites();

    }

    public void testerConversionsImplicites() {
        //3+4 qui vaut 7 est un int qui est converti implicitement en double
        double test = 3+4;
        System.out.println("test = " + test);

        int bigOne = 999979999;
        System.out.println("bigOne = " + bigOne);
        float bigOneConvertiF = bigOne;
        System.out.println("bigOneConvertiF = " + bigOneConvertiF);
        double bigOneConvertiD = bigOne;
        System.out.println("bigOneConvertiD = " + bigOneConvertiD);


   }

    public void testerConversionsExplicites() {
        // 3.2 est explicitement converti en int
        int test = (int) -3.2;
        //Que se passe-t-il??
        System.out.println("-3.2 -> int: test = " + test);
////
//        int x = 292;
//        float f = (float) x;    // Conversion sans perte d'information
//        byte b = (byte) x;      // Conversion avec perte d'information
//        char c = (char) b;      // Conversion d'un byte vers un char
//        System.out.println("x = " + x);
//        System.out.println("x -> float: f = " + f);
//        System.out.println("x -> byte: b = " + b);
//        System.out.println("b -> char: c = " + c);
//        System.out.println("b -> byte: c = " + (byte) c);

    }
}
