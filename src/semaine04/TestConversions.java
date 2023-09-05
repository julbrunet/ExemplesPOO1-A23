package semaine03;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-08-31
 */
public class TestConversions {
    public static void main(String[] args) {
        TestConversions testeur= new TestConversions();
        testeur.testerConversionsExplicites();
    }

    public void testerConversionsImplicites() {
        //3+4 qui vaut 7 est un int qui est converti implicitement en double
        double test = 3+4;

    }

    public void testerConversionsExplicites() {
        // 3.2 est explicitement converti en int
        int test = (int) 3.2;
        //Que se passe-t-il??


        int x = 292;
        float f = (float) x;    // Conversion sans perte d'information
        byte b = (byte) x;      // Conversion avec perte d'information
        char c = (char) b;      // Conversion d'un byte vers un char

        System.out.println("f = " + f);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("c = " + (byte) c);

    }
}
