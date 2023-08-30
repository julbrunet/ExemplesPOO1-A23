package semaine02;

import java.util.Scanner;

/**
 * Semiane02
 *
 * @author Julien.Brunet
 * @since 2023-08-24
 */
public class Exemple3 {

    public static void main(String[] args) {
        new Exemple3();
    }
    public Exemple3() {
        lireEtAfficherNomPrenom();
        lireEtAfficherPrenomEtNombreDeBilles();
    }

    public void lireEtAfficherNomPrenom() {
        Scanner sc; //Instance de l'utilitaire de lecture
        String nom;
        String prenom;

        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture

        System.out.println("Entrez votre nom : ");

//Appel d’une méthode qui récupère une chaine de caractères saisis au clavier.
        nom = sc.nextLine();

        System.out.println("Entrez votre prénom : ");
        prenom = sc.nextLine(); //lecture du prenom

        System.out.println("Bonjour Monsieur ou Madame " + nom);
        System.out.print("Je sais que votre prénom est " + prenom);

    }

    /**
     * Saisit le nombre de billes que possèdent Denis et Louise
     * et affiche le total de leurs billles.
     */
    public void lireEtAfficherDesNombresDeBilles() {
        Scanner sc; //Instance de l'utilitaire de lecture
        int nbBillesDenis;
        int nbBillesLouise;
        int totalBilles;

        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture

        System.out.println("Entrez le nombre de billes de Denis : ");
        nbBillesDenis = sc.nextInt();

        System.out.println("Entrez le nombre de billes de Louise : ");
        nbBillesLouise = sc.nextInt();

        totalBilles = nbBillesDenis + nbBillesLouise;

        System.out.println("Denis et Louise ont " + totalBilles + " billes ensembles.");
    }

    public void lireEtAfficherPrenomEtNombreDeBilles(){
        Scanner sc; //Instance de l'utilitaire de lecture
        int nbBilles;
        String prenom;

        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture

        System.out.println("Entrez le nombre de billes : ");
        nbBilles = sc.nextInt();


        System.out.println("Entrez le prenom : ");
        prenom = sc.nextLine();
        
        System.out.println("Vous etes: " + prenom + " et vous avez: "+nbBilles + " billes.");
    }

}
