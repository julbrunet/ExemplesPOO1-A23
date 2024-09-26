package semaine11.exemples_corriges.animaux;

/**
 * On controle l'acces a l'aide des modificateurs private devant les attributs
 * et on ajoute des accesseurs en lecture et en ecriture en foinction des besoins
 *
 * @author Julien.Brunet
 * 2022-10-31
 */
public class Animal3 {

    //Attribut qui contient l'espece de l'animal
    private String espece;

    //Attribut qui contient la taille de l'animal
    private double poids;

    public Animal3(String espece, double poids) {
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
        this.poids = poids;
    }
}
