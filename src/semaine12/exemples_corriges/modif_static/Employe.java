package semaine12.exemples_corriges.modif_static;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-11-13
 */
public class Employe {

    private String nom;

    private int identificateurUnique;

    private static int prochainIdLibre = 1;


    public Employe(String nom) {
        this.nom = nom;
        //On veut ici trouver un moyen de générer un id unique pour l'employé
        identificateurUnique = prochainIdLibre++;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdentificateurUnique() {
        return identificateurUnique;
    }

    private void setIdentificateurUnique(int identificateurUnique) {
        this.identificateurUnique = identificateurUnique;
    }


    public static int getNombreEmployesExistant() {
        return prochainIdLibre-1;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom=" + nom +
                ", identificateurUnique=" + identificateurUnique +
                '}';
    }
}
