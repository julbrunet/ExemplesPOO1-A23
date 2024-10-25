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

        int compteur =1;
        while(compteur <= 5) {
            System.out.println("Bonjour M " + compteur );
            compteur++;
        }


    }

    /**
     * Utiliser while et la methode genererNombre pour générer un nombre aléatoire supérieur à 90 (et inférieur ou égal à 100)
     * Afficher le nombre et le nombre d'itérations nécessaires
     */
    public void genererNombreSuperieur90AvecWhile() {

        int genere=0;
        int count=0;
        while(genere<=90) {
            genere = genererNombre();
            count++;
        }
        System.out.println(genere + " nbre d'etapes necessaire: "+ count);

    }

    /**
     * Utiliser do...while et la methode genererNombre pour générer un nombre aléatoire supérieur à 90 (et inférieur ou égal à 100)
     * Afficher le nombre et le nombre d'itérations nécessaires
     */
    public void genererNombreSuperieur90AvecDoWhile() {
        int genere;
        int count=0;
        do {
            genere = genererNombre();
            count++;
        }while(genere<=90);
        System.out.println(genere + " nbre d'etapes necessaire: "+ count);
    }

}
