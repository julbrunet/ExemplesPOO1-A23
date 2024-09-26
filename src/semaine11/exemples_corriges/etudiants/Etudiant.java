package semaine11.exemples_corriges.etudiants;

import java.util.Calendar;
import java.util.Date;

/**
 * ExemplesPOO1
 *
 * @author Julien.Brunet
 * @since 2023-11-08
 */
public class Etudiant {

    /* Les constantes de la classe étudiant     */
    public static final String PROGRAMME_INFORMATIQUE = "Informatique";

    public static final String PROGRAMME_LETTRES = "Lettres";
    public static final String PROGRAMME_SPORT = "Sport";
    public static final String DEFAULT_PROGRAMME = PROGRAMME_INFORMATIQUE;
    public static final int DEFAULT_SESSION = 1;
    public static final int DERNIERE_SESSION = 6;

    /* Les attributes d'un étudiant     */

    private String nom;

    private String programme = DEFAULT_PROGRAMME;

    private int session = DEFAULT_SESSION;

    private Date dateEntree = Calendar.getInstance().getTime();

    public Etudiant(String nom, String programme, Date dateEntree) {
        this.nom = nom;
        setProgramme(programme);
        setSession(DEFAULT_SESSION);
        this.dateEntree = dateEntree;
    }

    /**
     * Constructeur qui initialise un étudiant.
     * Si la session est invalide on le met en sport
     * si la session est invalide on le met en premiere
     *
     * @param nom       son nom
     * @param programme son programme (sport si invalide)
     * @param session   (sa session) 1 si invalide
     */
    public Etudiant(String nom, String programme) {
        this.nom = nom;
        setProgramme(programme);
        setSession(DEFAULT_SESSION);
    }


    /* les constructeurs*/

    private Date getDateEntree() {
        return dateEntree;
    }

    private void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    /**
     * accesseur sur le nom
     *
     * @return le nom de l'etudiant
     */
    public String getNom() {
        return nom;
    }

    /**
     * mutateur sur le nom ne doit pas etre accessible de l'extérieur
     *
     * @param nom le nouveau nom
     */
    private void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * accesseur sur le programme
     *
     * @return le programme de l'etudiant
     */
    public String getProgramme() {
        return programme;
    }

    /**
     * Change le programme si c'est possible
     *
     * @param programme le nouvveau
     */
    public void setProgramme(String programme) {
        if (programmeEstValide(programme)) {
            this.programme = programme;
        }
    }

    /**
     * accesseur sur la session
     *
     * @return le session de l'etudiant
     */
    public int getSession() {
        return session;
    }

    /**
     * change la session, ne doit pas etre accessible de l'extérieur
     *
     * @param session
     */
    private void setSession(int session) {
        if (sessionEstValide(session)) {
            this.session = session;
        }
    }


    /**
     * Faire passer l'étudiant à la session suivante si cela est possible
     * le laisse en derniere sinon
     */
    public void changerSession() {
        setSession(session + 1);
        //TODO implémenter la diplomation
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", programme='" + programme + '\'' +
                ", session=" + session +
                '}';
    }

    public boolean estEntreAvant(Etudiant autreEtudiant) {
        return  getDateEntree().before(autreEtudiant.getDateEntree());
    }


        /**
         * Valide si la session est un programme existant
         *
         * @param session la session a valider
         * @return true si la session existe
         */
    private boolean sessionEstValide(int session) {
        return 1 <= session && session <= DERNIERE_SESSION;
    }

    /**
     * Valide si le programme est un programme existant
     *
     * @param programme le programme a valider
     * @return true si le programme
     */
    private boolean programmeEstValide(String programme) {
        boolean valide = false;
        if (programme != null) {
            valide = programme.equals(PROGRAMME_INFORMATIQUE)
                    || programme.equals(PROGRAMME_LETTRES)
                    || programme.equals(PROGRAMME_SPORT);
        }
        return valide;
    }

}
