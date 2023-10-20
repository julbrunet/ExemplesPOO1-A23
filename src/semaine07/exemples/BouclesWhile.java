package semaine07.exemples;

public class BouclesWhile {

    public static final int MAX = 100;

    public static void main(String[] args) {

        BouclesWhile test = new BouclesWhile();

        System.out.println("5 salutations différentes:");
        test.saluerCinqFoisDifferement();

        System.out.println("Superieur à 90 avec while:");
        test.genererNombreSuperieur90AvecWhile();

        System.out.println("Superieur à 90 avec do while:");
        test.genererNombreSuperieur90AvecDoWhile();

    }

    /**
     * Génére un entier entre 0 (inclus) et max (inclus)
     *
     * @return le nombre generé
     */
    public int genererNombre() {
        return (int) (Math.random() * 100 + 1);
    }

    /**
     * Utilise une boucle while pour générer la sortie
     * Salut Monsieur numero 1
     * Salut Monsieur numero 2
     * Salut Monsieur numero 3
     * Salut Monsieur numero 4
     * Salut Monsieur numero 5
     */
    public void saluerCinqFoisDifferement() {
        int i = 1;
        while (i <= 5) {
            System.out.println("Salut Monsieur numero " + i);
            i++;
        }
    }

    /**
     * Utiliser while et la methode genererNombre pour générer un nombre aléatoire supérieur à 90 (et inférieur ou égal à 100)
     * Afficher le nombre et le nombre d'itérations nécessaires
     */
    public void genererNombreSuperieur90AvecWhile() {
        int nombre = genererNombre();
        int compteur = 1;
        while (nombre <= 90) {
            nombre = genererNombre();
            compteur++;
        }
        System.out.println(nombre + " a ete genre en " + compteur + " iterations!");

    }

    /**
     * Utiliser do...while et la methode genererNombre pour générer un nombre aléatoire supérieur à 90 (et inférieur ou égal à 100)
     * Afficher le nombre et le nombre d'itérations nécessaires
     */
    public void genererNombreSuperieur90AvecDoWhile() {
        int nombre;
        int compteur = 0;
        do {
            nombre = genererNombre();
            compteur++;
        } while (nombre <= 90);
        System.out.println(nombre + " a ete genre en " + compteur + " iterations!");
    }

}
