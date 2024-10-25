package semaine07.exemples_corriges;

public class BoucleFor {

    public static final int MAX = 100;

    /**
     * Génére un entier entre 1 (inclus) et max (inclus)
     *
     * @return le nombre generé
     */
    public int genererNombre() {
        return (int) (Math.random() * 100 + 1);
    }

    /**
     * Utilise une boucle for pour générer 5 fois le texte Salut Monsieur
     */
    public void saluerCinqFois() {

//        for(int i = 1; i <=5; i++){
//              System.out.println("Salut Monsieur");
//          }

        for (int i = 0; i < 5; i++) {
            System.out.println("Salut Monsieur");
        }

    }

    /**
     * Utilise une boucle for pour générer la sortie
     * Salut Monsieur numero 1
     * Salut Monsieur numero 2
     * Salut Monsieur numero 3
     * Salut Monsieur numero 4
     * Salut Monsieur numero 5
     */
    public void saluerCinqFoisDifferement() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Salut Monsieur numéro " + (i + 1));
        }

    }

    /**
     * Utilise une boucle for pour générer 10 nombre entre 1 et 100 et les afficher en ligne
     */
    public void genererDixNombresInferieurCent() {
        for (int j = 0; j < 10; j++) {
            System.out.print(genererNombre() + " ");
        }
        System.out.println();

    }

    /**
     * Utilise une boucle for pour générer un nombre passé en paramètre de nombre entre 1 et 100 et les afficher en ligne
     *
     * @param nombreGenerations le nombre de générations souhaitées
     */
    public void genererNombresInferieurCent(int nombreGenerations) {
        for (int j = 0; j < nombreGenerations; j++) {
            System.out.print(genererNombre() + " ");
        }
        System.out.println();
    }


    /**
     * Utilise une boucle for pour générer la sortie
     * Salut Monsieur numero 2
     * Salut Monsieur numero 4
     * Salut Monsieur numero 6
     * Salut Monsieur numero 8
     * Salut Monsieur numero 10
     */
    public void saluerMonsieurPairsUniquement() {
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println("Salut Monsieur numéro " + i);
        }

    }

    /**
     * Utilise une boucle for pour générer la sortie
     * Salut Monsieur numero 11
     * Salut Monsieur numero 13
     * Salut Monsieur numero 15
     * Salut Monsieur numero 17
     * Salut Monsieur numero 19
     */
    public void saluerMonsieursImpairsEntre10et20() {
        for (int i = 11; i <= 20; i = i + 2) {
            System.out.println("Salut Monsieur numéro " + i);
        }

    }


    /**
     * Utilise une boucle for pour générer la sortie
     * Salut Monsieur numero 20
     * Salut Monsieur numero 18
     * Salut Monsieur numero 16
     * Salut Monsieur numero 14
     * Salut Monsieur numero 12
     * Salut Monsieur numero 10
     */
    public void saluerMonsieursPAirsEtDecroissants() {
        for (int i = 20; i >= 10; i = i - 2) {
            System.out.println("Salut Monsieur numéro " + i);

        }
    }

    /**
     * Challenge 1:
     * Generer un nombre de lignes passé en parametres contenant chacune un certain nombre de nombre passé en parametre
     *
     * @param nombres le nombre de nombres par lignes
     * @param lignes  le nombre de lignes
     */
    public void genererNombreAleatoirsEnLignes(int nombres, int lignes) {
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < nombres; j++) {
                System.out.print(genererNombre() + " ");
            }
            System.out.println();
        }
    }

    /**
     * Challenge 2:
     * Utiliser une boucle for(;;) vide pour saluer les Monsieurs de 1 à 10.
     */
    public void saluerDixMonsieur() {
        int i = 1;
        for (; ; ) {
            System.out.println("Salut Monsieur numéro " + i);
            i++;
            if (i > 10) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        BoucleFor test = new BoucleFor();
        System.out.println("5 salutations identiques:");
        test.saluerCinqFois();

        System.out.println("5 salutations différentes:");
        test.saluerCinqFoisDifferement();

        System.out.println("10 nombresAleatoires:");
        test.genererDixNombresInferieurCent();

        System.out.println("3 nombresAleatoires:");
        test.genererNombresInferieurCent(3);
        System.out.println("8 nombresAleatoires:");
        test.genererNombresInferieurCent(8);

        System.out.println("saluer 5 pairs:");
        test.saluerMonsieurPairsUniquement();

        System.out.println("saluer 5 impairs depuis 11:");
        test.saluerMonsieursImpairsEntre10et20();


        System.out.println("saluer 6 pairs decroissants depuis 20:");
        test.saluerMonsieursPAirsEtDecroissants();


        System.out.println("challenge 1:");
        System.out.println("3 nombres sur 2 lignes :");
        test.genererNombreAleatoirsEnLignes(3, 2);

        System.out.println("5 nombres sur 3 lignes :");
        test.genererNombreAleatoirsEnLignes(5, 3);

        System.out.println("challenge 2:");
        System.out.println("Saluer Monsieur 1 a 10 avec une boucle for vide! :");
        test.saluerDixMonsieur();


    }

}
