package semaine02;


import java.util.Scanner;

/**
 * ExemplesPOO1.iml
 *
 * @author Julien.Brunet
 * @since 2024-09-05
 */
public class UtilisationScanner {
    public static void main(String[] args) {
        UtilisationScanner util = new UtilisationScanner();
        util.demanderNom();
    }

    public void demanderNom() {

        //construit (instancie ) un objet sacnner....
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel est ton nom? ");
        String nomEntrePArUtilisateur = scanner.nextLine();
        System.out.println("Ok... et quel age as tu?");
        int age = scanner.nextInt();
        System.out.println("Salut tu es: " + nomEntrePArUtilisateur + " et tu es né en " + (2024 - age));

        System.out.println("Ok... et combien tu peses?");
        double poids = scanner.nextDouble();
        //Pour gerer le probleme du nextInt suivi du nexLine...
        scanner.nextLine();

        System.out.println("As tu quelque chose a ajouter?");
        String ajout = scanner.nextLine();

        System.out.println("Ajout: " + ajout);
    }
}
