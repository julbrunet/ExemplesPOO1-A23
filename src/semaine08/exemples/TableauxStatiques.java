package semaine08.exemples;

import java.util.Arrays;

public class TableauxStatiques {

    public static void main(String[] args) {
        TableauxStatiques test = new TableauxStatiques();

        test.decouverte();

    }

    public void decouverte() {
        //On déclare un tableau d'entiers nommé monTableau
        int[] monTableau;

        //On lui alloue l'espace pour 5 entiers!!
        monTableau = new int[5];

        //On peut dès lors accéder à sa longueur (qui est fixe et ne pourra jamais etre modifiée)
        System.out.println(monTableau.length);

        //Observons que l'affichage du tableau n'est pas très parlant...
        System.out.println(monTableau);

        //On peut bien sur faire tout d'un coup
        //et aussi utiliser un autre type
        double[] autreTableau = new double[10];


        //On peut accéder à un élément du tableau grace a sa position (ici 2) avec la syntaxe suivante:


        //Le tableau a été initialisé par défaut avec des 0!! Observons-le
        System.out.println("Avant le remplissage");
        System.out.println(Arrays.toString(monTableau));
//        System.out.println("En position 0 : "  + monTableau[0]);
//        System.out.println("En position 1 : "  + monTableau[1]);
//        System.out.println("En position 2 : "  + monTableau[2]);
//        System.out.println("En position 3 : "  + monTableau[3]);
//        System.out.println("En position 4 : "  + monTableau[4]);

        //Utilisons une boucle pour le remplir avec 10,20 3 40 et 50

        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = (i+1)*10;
        }


        //A ce moment, on peut observer n'importe quelle case du tableau:
        System.out.println("Apres le remplissage");
//
//        System.out.println("En position 0 : "  + monTableau[0]);
//        System.out.println("En position 1 : "  + monTableau[1]);
//        System.out.println("En position 2 : "  + monTableau[2]);
//        System.out.println("En position 3 : "  + monTableau[3]);
//        System.out.println("En position 4 : "  + monTableau[4]);
        System.out.println(Arrays.toString(monTableau));

        ///Attention la position 5 ne peut pas etre accédée, le tableau est numéroté de 0-4
       // System.out.println("En position 5 : "  + monTableau[5]);

        //On peut travailler avec des tableaux d'objets aussi:
        String[] mesMots = new String[3];
        mesMots[0] = "Salut";
        mesMots[1] = "ca";
        mesMots[2] = "va?";
        System.out.println(Arrays.toString(mesMots));

        //On peut aussi remplir le tableau de maniere directe et explicite comme ceci, le new est caché...
        int[] tableauExplicite = {1,3,7,9,12};


        //On a  plusieurs méthodes pour parcourir un tableau:
        //Les boucles traditionnelles (for si on veut tout parcourir)

        for (int i = 0; i < tableauExplicite.length; i++) {
            System.out.print( tableauExplicite[i] + " ");
        }

        System.out.println();

        //ou while si on s'arrete dès qu'on obtenu ce que l'on veut)

        int nombreCourant = 0;
        int i =0;
        while(nombreCourant>=0 && i<tableauExplicite.length) {
            nombreCourant = tableauExplicite[i];
            i++;
        }
        System.out.println(nombreCourant);

        // Et un raccourci bien utile pour l'afficher:
//        System.out.println(Arrays.toString(monTableau));

    }

}
