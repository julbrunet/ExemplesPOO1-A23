package semaine08.exemples;

import java.util.Arrays;

public class TableauxStatiques {

    public static void main(String[] args) {
        TableauxStatiques test = new TableauxStatiques();

        test.decouverte();
//
//        test.methode1();
//
//        test.methode2();
    }

    public void decouverte() {
        //On déclare un tableau d'entiers nommé monTableau


        //On lui alloue l'espace pour 5 entiers!!


        //On peut dès lors accéder à sa longueur (qui est fixe et ne pourra jamais etre modifiée)


        //Observons que l'affichage du tableau n'est pas très parlant...



        //On peut bien sur faire tout d'un coup
        //et aussi utiliser un autre type



        //On peut accéder à un élément du tableau grace a sa position (ici 2) avec la syntaxe suivante:


        //Le tableau a été initialisé par défaut avec des 0!! Observons-le
        System.out.println("Avant le remplissage");


        //Utilisons une boucle pour le remplir


        //A ce moment, on peut observer n'importe quelle case du tableau:
        System.out.println("Après le remplissage");

        ///Attention la position 5 ne peut pas etre accédée, le tableau est numéroté de 0-4


        //On peut travailler avec des tableaux d'objets aussi:

        //On peut aussi remplir le tableau de maniere directe et explicite comme ceci, le new est caché...



        //On a  plusieurs méthodes pour parcourir un tableau:
        //Les boucles traditionnelles (for si on veut tout parcourir)


        //ou while si on s'arrete dès qu'on obtenu ce que l'on veut)


        // Et un raccourci bien utile pour l'afficher:




    }



    /**
     * Initialiser un tableau de 20 doubles
     * Le remplir avec les nombres de 0.01 à 0.20.
     * Afficher tous ses éléments séparés par un espace
     */
    public void methode1() {


    }

    /**
     * Remplacer Mercredi par Dimanche
     * Parcourir le tableau avec une boucle pour afficher tous les éléments
     */
    public void methode2() {

    }
}
