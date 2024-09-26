package semaine12.exemples.constructeurs;

/**
 * CoursPOO1 - semaine11.exemples.constructeurs
 *
 * @author Julien.Brunet
 * @since 2022-11-08
 */
public class Bateau {

    public static final String COULEUR_DEFAUT = "Blanc";
    public static final int LONGUEUR_DEFAUT = 18;
    public static final String NOM_DEFAUT = "NO NAME";

    private int longueur;

    private String couleur =COULEUR_DEFAUT;

    private String nom =NOM_DEFAUT;

    public Bateau(int longueur, String couleur, String nom) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        if(longueur >0) {
            this.longueur = longueur;
        }
        else  {
            System.out.println("Erreur,...");
        }
        this.couleur = couleur;
        this.nom = nom;
    }

    public Bateau(int longueur) {

        this(longueur,COULEUR_DEFAUT,NOM_DEFAUT);
    }

    public Bateau() {
        this(LONGUEUR_DEFAUT,COULEUR_DEFAUT,NOM_DEFAUT);
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
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
