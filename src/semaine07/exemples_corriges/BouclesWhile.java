package semaine07.exemples_corriges;

public class BouclesWhile {

    public static final int MAX=100;
    public static final int BORNE_INFERIEURE = 90;

    /**
     * Génére un entier entre 1 (inclus) et max (inclus)

     * @return le nombre generé
     */
    public int genererNombre(){
        return (int) (Math.random()*100+1);
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
        while(i<=5) {
            System.out.println("Salut Monsieur numéro " + i);
            i++;
        }
    }
    /**
     * Utiliser while et la methode genererNombre pour générer un nombre aléatoire supérieur à 90 (et inférieur ou égal à 100)
     * Afficher le nombre et le nombre d'itérations nécessaires
     */
    public void genererNombreSuperieur90AvecWhile(){

        boolean trouve = false;
        int nombre =-1;
        int iterations =0;
        while(!trouve) {
            iterations++;
            nombre = genererNombre();
            if(nombre > BORNE_INFERIEURE){
                trouve =true;
            }
        }
        System.out.println("Le nombre " + nombre + " a été obtenu après " + iterations + " itérations.");

    }


    /**
     * Utiliser do...while et la methode genererNombre pour générer un nombre aléatoire supérieur à 90 (et inférieur ou égal à 100)
     * Afficher le nombre et le nombre d'itérations nécessaires
     */
    public void genererNombreSuperieur90AvecDoWhile(){

        int nombre;
        int iterations =0;
        do {
            iterations++;
            nombre = genererNombre();

        }while(nombre <= BORNE_INFERIEURE);

        System.out.println("Le nombre " + nombre + " a été obtenu après " + iterations + " itérations.");
    }

    /**
     * Utilise une boucle while pour générer la sortie
     * Salut Monsieur numero 20
     * Salut Monsieur numero 18
     * Salut Monsieur numero 16
     * Salut Monsieur numero 14
     * Salut Monsieur numero 12
     * Salut Monsieur numero 10
     */
    public void saluerMonsieursPairsEtDecroissants() {
        int compteurMonsieur = 20;
        while(compteurMonsieur>=10) {
            System.out.println("Salut Monsieur numéro " + compteurMonsieur);
            compteurMonsieur+=-2;
        }
        //Aussi possible, un peu moins lisible...
    }



    public static void main(String[] args) {
        BouclesWhile test = new BouclesWhile();

        System.out.println("5 salutations différentes:");
        test.saluerCinqFoisDifferement();

        System.out.println("Superieur à 90 avec while:");
        test.genererNombreSuperieur90AvecWhile();

        System.out.println("Superieur à 90 avec do while:");
        test.genererNombreSuperieur90AvecDoWhile();
        //Plus adapté!

        System.out.println("saluer 6 pairs decroissants depuis 20 avec while");
        test.saluerMonsieursPairsEtDecroissants();

    }
}
