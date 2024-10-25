package semaine09.exemples_corriges;

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
        int longueur = monTableau.length;
        System.out.println("longueur = " + longueur);

        //Observons que l'affichage du tableau n'est pas très parlant...
        System.out.println("monTableau = " + monTableau);

        //On peut bien sur faire tout d'un coup
        //et aussi utiliser un autre type
        double[] autreTableau = new double[10];


        //On peut accéder à un élément du tableau grace a sa position (ici 2) avec la syntaxe suivante:
        System.out.println("Troisieme element: " + monTableau[2]);

        //Le tableau a été initialisé par défaut avec des 0!!
				
        //Utilisons une boucle pour l'observer
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(		monTableau[i] + ", ");
	
        }
		
		
        //Utilisons une boucle pour le remplir
        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = i * i;
        }


        //A ce moment:
        System.out.println("Après le remplissage");
        System.out.println("Voici la valeur à la position 2 du tableau: " + monTableau[2]);
        ///Attention la position 5 ne peut pas etre accédéé, le tableau est numéroté de 0-4
        //System.out.println("Voici la valeur à la position 5 du tableau: " + monTableau[5]);

        //On peut travailler avec des tableaux d'objets aussi:
        String[] troisiemeTableau = new String[3];
        for (int i = 0; i < troisiemeTableau.length; i++) {
            troisiemeTableau[i] = "toto " + i;
        }
        System.out.println("Voici la valeur à la position 1 du tableau de string: " + troisiemeTableau[1]);
        //On peut aussi remplir le tableau de maniere explicite comme ceci, le new est caché...
        int[] tab = {6,3,0,12};

        //On a plusieurs méthodes pour parcourir un tableau:
        //Les boucles traditionnelles (for si on veut tout parcourir ou while si on s'arrete dès qu'on obtenu ce que l'on veut)

        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[i] = " + tab[i]);
            System.out.println("i = " + i);
        }
		
		for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[i] = " + tab[i]);
            System.out.println("i = " + i);
        }
        // Et un raccourci bien utile pour l'afficher:
        System.out.println(Arrays.toString(tab));
    }


}
