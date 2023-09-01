package semaine03;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-08-31
 */
public class PorteeVariables {
    public static void main(String[] args) {
        //a n'est valide que dans le main
        int a = 3;
        PorteeVariables objet = new PorteeVariables();
        objet.methode1();
        objet.methode2();
        // b et c sont inconnus ici!

    }

    public void methode2() {
        //b n'est valide que dans cette methode
        int b=5;
        // a et c sont inconnus ici!
    }

    public void methode1() {
        //c n'est valide que dans cette methode
        int c = 7;
        // a et b sont inconnus ici!
    }
}
