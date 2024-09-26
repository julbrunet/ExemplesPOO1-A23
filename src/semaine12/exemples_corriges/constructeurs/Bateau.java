package semaine12.exemples_corriges.constructeurs;

import java.sql.SQLOutput;

/**
 * CoursPOO1 - semaine11.exemples.constructeurs
 *
 * @author Julien.Brunet
 * @since 2022-11-08
 */
public class Bateau {

    public static final String COULEUR_DEFAUT = "Blanc";
    public static final int LONGUEUR_DEFAUT = 18;

    private int longueur = LONGUEUR_DEFAUT;

    private String couleur = COULEUR_DEFAUT;

    private String nom = "";

    public Bateau(int longueur, String couleur, String nom) {
setLongueur(longueur);
        this.couleur = couleur;
        this.nom = nom;
    }


    public Bateau(int longueur) {
        //appel au constructeur a trois paramètres
        this(longueur,COULEUR_DEFAUT,"");
    }
    public Bateau() {
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        if(longueur > 0) {
            this.longueur = longueur;
        }
        else {
            System.out.println("Erreur: on ne peut pas créer un bateau de longueur négative ou nulle...");
        }
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Bateau{" +
                "longueur=" + longueur +
                ", couleur='" + couleur + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
