package semaine08.exemples_corriges;

import java.util.Arrays;

/**
 * CoursPOO1 - semaine09.exemples
 *
 * @author Julien.Brunet
 * 2022-10-28
 */
public class ExercicesCours {

    public static final int TAILLE = 8;

    public static void main(String[] args) {
        //1. Instancier un tableau de 8 nombres entiers appelé tab1.
        int[] tab1 = new int[TAILLE];
        // Afficher le résultat.
        System.out.println("1. " + Arrays.toString(tab1));


        //2. Instancier un tableau d’entiers appelé tab2, contenant les nombres de 10 à 17.
        int[] tab2 = new int[TAILLE];
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = i+10;
        }
//        int[] tab2={10,11,12,13,14,15,16,17};
        // Afficher le résultat.

        System.out.println("2. " + Arrays.toString(tab2));


        //3. Écrire les instructions Java qui placeront dans tab1 la valeur 0 dans les positions impaires
        // et des 1 dans les positions paires.
        for (int i = 0; i < tab1.length; i++) {
            if (i % 2 == 0) {
                //Remplace la valeur du tableau en position i par 1
                tab1[i] = 1;
            }
        }
        // Afficher le résultat.
        System.out.println("3. " + Arrays.toString(tab1));

        //4. Écrire les instructions qui permettent de remplacer les 1 par la valeur correspondante de tab2.

        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] == 1) {
                //Remplace la valeur du tableau en position i par 1
                tab1[i] = tab2[i];
            }
        }
        // Afficher le résultat.
        System.out.println("4. " + Arrays.toString(tab1));
        //5. Écrire les instructions Java pour afficher la somme des valeurs des tableau.
        // Tester pour les deux tableaux sans dupliquer le code.
        ExercicesCours obj = new ExercicesCours();
        System.out.println("5. Somme tab1 = " + obj.calculerSomme(tab1) + ", Somme tab2 = " + obj.calculerSomme(tab2));

        //6.Insérer le nombre 100 à la position 5 de tab1. Constat?
        //L'instruction tab1[5]=100 n'insere pas elle remplace
        //Pour inserer il faut:
        //a. Creer un nouveau tableau de taille n+1
        int[] nouveau = new int[tab1.length + 1];
        //b.Remplir le tableau en inserant les anciennes valeurs en laissant la place numero 5 pour le nouveua nombre..
        for (int i = 0; i < nouveau.length; i++) {
            if (i < 5) {
                nouveau[i] = tab1[i];
            } else if (i == 5) {
                nouveau[i] = 100;
            } else {
                nouveau[i] = tab1[i - 1];
            }
        }
        //b.Remplacer tab1 par le nouveau...
        tab1 = nouveau;
        // Afficher le résultat.                                
        System.out.println("4. " + Arrays.toString(tab1));      
    }

    /**
     * Methode qui calcule la somme des elements du tableau
     *
     * @param tableau le tableau dont on calcule la somme
     * @return la somme calculée
     */
    public int calculerSomme(int[] tableau) {
        int somme = 0;

        //Utilisons un iterateur pour changer...
        for (int courant : tableau) {
            somme += courant;

        }
        return somme;
    }
}
