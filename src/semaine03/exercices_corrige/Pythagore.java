package semaine03.exercices_corrige;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-08-31
 */
public class Pythagore {
    public static void main(String[] args) {
        Pythagore maitre = new Pythagore();

        System.out.println("-------------------------------");
        maitre.afficherSomme(6, 10);
        maitre.afficherSomme(32, 3);
        System.out.println("-------------------------------");
        int res = maitre.calculerSomme(3, 4);
        System.out.println("3+4= " + res);

        int autreRes = maitre.calculerSomme(100, 12);
        System.out.println("100+12= " + autreRes);

        System.out.println("-------------------------------");
        //Combiner les calculs comme demand�
        int aCarre = maitre.calculerCarre(5);
        int bCarre = maitre.calculerCarre(3);
        int somme = maitre.calculerSomme(aCarre, bCarre);
        System.out.println("5^2+3^2= " + somme);

        int aPlusb = maitre.calculerSomme(23, 44);
        int aPlusBCarre = maitre.calculerCarre(aPlusb);
        int cCarre = maitre.calculerCarre(17);
        int sommeFinale = maitre.calculerSomme(aPlusBCarre, cCarre);
        System.out.println("(23+44)^2+17^2= " + sommeFinale);
        System.out.println("-------------------------------");

        res = maitre.carreSommeCarre(1,1, 1);
        System.out.println("(1^2+1^2+1^2)^2= " + res);
        res = maitre.carreSommeCarre(3,4, 2);
        System.out.println("(3^2+4^2+2^2)^2= " + res);
        res = maitre.carreSommeCarre(2,3,4);
        System.out.println("(2^2+3^2+4^2)^2= " + res);
    }


    public void afficherSomme(int a, int b) {
        int resultat = a + b;
        System.out.println("somme=  " + resultat);
    }

    public int calculerSomme(int a, int b) {
        int resultat = a + b;
        return resultat;
    }

    public int calculerCarre(int a) {
        int resultat = a * a;
        return resultat;
    }

    public int carreSommeCarre(int a,int b, int c) {
        int resultat = calculerCarre(a) + calculerCarre(b) + calculerCarre(c)    ;
        resultat = calculerCarre(resultat );
        //On aurait pu aussi utiliser calculerSomme deux fois mais ca semble un peu compliqu� pour rien...
        return resultat;
    }
}
