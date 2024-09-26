package semaine11.exemples_corriges.animaux;

/**
 * On ajoute un constructeur
 *
 * @author Julien.Brunet
 * 2022-10-31
 */
public class Animal2 {
    //Attribut qui contient l'espece de l'animal
    public String espece;

    //Attribut qui contient la taille de l'animal
    public double poids;

    public Animal2(String espece, double poids) {
        this.espece = espece;
        this.poids = poids;
    }

    public void decrire() {
        System.out.println(espece + " pesant " + poids + " kg");
    }


}
