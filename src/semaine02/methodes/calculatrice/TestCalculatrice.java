package semaine02.methodes.calculatrice;

import java.util.Scanner;

public class TestCalculatrice {
    public static void main(String[] args)
    {
// Déclaration des variables
        int nb1, nb2, difference;
        Scanner clavier = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();

// Demander les 2 nombres
        System.out.println("Entrez le nombre 1: ");
        nb1 = clavier.nextInt();
        System.out.println("Entrez le nombre 2: ");
        nb2 = clavier.nextInt();

// Calculer la somme et la différence
        calc.additionner(nb1, nb2);


        difference = calc.soustraire(nb1, nb2);


// Afficher la différence
        System.out.println("La différence est: " + difference);

    }

}
