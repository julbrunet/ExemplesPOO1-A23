package semaine11.exemples_corriges.animaux;

/**
 * Les modificateurs peuvent aussi contenir d'Autres chose par exemple de la validation
 *
 * @author Julien.Brunet
 * 2022-10-31
 */
public class Animal4 {

    //Attribut qui contient l'espece de l'animal
    private String espece;

    //Attribut qui contient la taille de l'animal
    private double poids;

    public Animal4(String espece, double poids) {
        this.espece = espece;
        this.poids = poids;
    }

    public void decrire() {
        System.out.println(espece + " pesant " + poids + " kg");
    }

    public String getEspece() {
        return espece;
    }

    private void setEspece(String espece) {
        this.espece = espece;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        if(poids < 0) {
            System.out.println("Impossible de modifier pour un poids négatif!");
        }
        else{
            this.poids = poids;
        }
    }
}
