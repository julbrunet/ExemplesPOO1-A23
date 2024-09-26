package semaine11.exemples_corriges.animaux;

/**
 * Classe  avec ultra basique avec deux attributs
 * @author Julien.Brunet
 * 2022-10-31
 */
public class Animal1 {
    //Attribut qui contient l'espece de l'animal
    public String espece;

    //Attribut qui contient la taille de l'animal
    public double poidsAnimal;

    public void decrire(){
        System.out.println(espece + " pesant " + poidsAnimal + " kg");
    }
}
