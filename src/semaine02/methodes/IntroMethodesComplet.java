package semaine02.methodes;

/**
 * Semaine02
 *
 * @author Julien.Brunet
 * @since 2023-08-29
 */
public class IntroMethodesComplet {
    public static void main(String[] args) {
        IntroMethodesComplet objet = new IntroMethodesComplet();

        objet.afficher3fois4();

        int res = objet.calculerMultiplication(3,6);
        System.out.println(res);
    }


    public void afficher3fois4() {

        int resultat = 3*4;
        System.out.println("3*4 = " + resultat);

    }

    public void afficherMultiplication(int a, int b) {
        int resultat = a*b;
        System.out.println(a + " * " + b + " = " + resultat);

    }

    public int calculerMultiplication(int a, int b) {
        int resultat = a*b;
        System.out.println(" Je suis en train de calculer...");
        return resultat;
    }



    public IntroMethodesComplet(){

    }

}
