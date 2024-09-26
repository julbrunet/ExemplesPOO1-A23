package semaine08.exemples_corriges;

import java.util.Arrays;

public class PassageTableaux {

    public static int TAILLE = 10;

    public static void main(String[] args) {
        PassageTableaux test = new PassageTableaux();
        //ecrire les tests des methodes ci-dessous..
        int[] nouveau = test.initialiserTableau();
        System.out.println(Arrays.toString(nouveau));

        int[] tableau2 = {2, 5, 8, 3};
        int[] nouveau2 = test.inverserTableau(tableau2);
        System.out.println("2.ancien = " + Arrays.toString(tableau2));
        System.out.println("2.nouveau = " + Arrays.toString(nouveau2));


        int[] tableau3 = {2, 5, 8, 3};
        System.out.println("3.original = " + Arrays.toString(tableau3));
        test.modifierTableau(tableau3);
        System.out.println("3.modifie = " + Arrays.toString(tableau3));
    }

    /**
     * Ecrire une méthode initialiserTableau qui crée un tableau de TAILLE entiers
     * et l'initialise avec les entiers de 1 à 10.
     *
     * @return un tableau d'entiers initialisé
     */
    public int[] initialiserTableau() {
        int[] tableau = new int[TAILLE];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i + 1;
        }
        return tableau;
    }

    /**
     * Ecrire une méthode inverserTableau qui recoit un tableau d'entiers en parametre
     * et retourne un nouveau tableau avec les elements du premeir dans L,orde inverse
     *
     * @param original un tableau d'entiers
     * @return un nouveau tableau d'entiers
     */
    public int[] inverserTableau(int[] original) {
        int[] nouveau = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            nouveau[original.length-1-i] = original[i];
        }
        return nouveau;
    }


    /**
     * Ecrire une méthode modifierTableau qui recoit un tableau d'entiers en parametre
     * et ajoute 10 a chacun des entiers
     *
     * @param original un tableau d'entiers
     */
    public void modifierTableau(int[] original) {

        for (int i = 0; i < original.length; i++) {
            original[i] += 10;
        }

    }


}
