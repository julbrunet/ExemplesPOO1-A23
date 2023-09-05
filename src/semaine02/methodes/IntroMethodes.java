package semaine02.methodes;

/**
 * Semaine02
 *
 * @author Julien.Brunet
 * @since 2023-08-29
 */
public class IntroMethodes {

    public static void main(String[] args) {

        IntroMethodes toto = new IntroMethodes();


        toto.afficher3fois4();

        int a= 12;
        int b = 13;

        toto.afficherMultiplication(a,b);

        toto.afficherMultiplication(5,8);

        toto.afficherMultiplication(3,0);

        toto.afficherMultiplication(167,9876);

        int res = toto.calculerMultiplication(10,5);
        System.out.println("10 * 5 = " + res);
    }
    public void afficherMultiplication(int premierNombre,int deuxiemeNombre){
        int resultat = premierNombre*deuxiemeNombre;
        System.out.println(premierNombre + " * " +deuxiemeNombre + " = " + resultat);
    }

    public int calculerMultiplication(int premierNombre,int deuxiemeNombre){
        int resultat = premierNombre*deuxiemeNombre;
        return resultat;
    }

    public void afficher3fois4() {

        int resultat = 3*4;
        System.out.println("3*4 = " + resultat);

    }



}
