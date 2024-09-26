package semaine11.exemples.etudiants;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-11-09
 */
public class Etudiant {

    /* Les constantes de la classe étudiant     */
    public static final String PROGRAMME_INFORMATIQUE = "Informatique";
    public static final String PROGRAMME_LETTRES = "Lettres";
    public static final String PROGRAMME_SPORT = "Sport";

    public static final String DEFAULT_PROGRAMME = PROGRAMME_INFORMATIQUE;
    public static final int DEFAULT_SESSION = 1;
    public static final int DERNIERE_SESSION = 6;


    private String nom ="";

    private String programme = DEFAULT_PROGRAMME ;

    private int session= DEFAULT_SESSION;

    public Etudiant(String nom, String programme) {
        this.nom = nom;
        setProgramme(programme);
        this.session = DEFAULT_SESSION;
    }

    public Etudiant(String nom) {
        this.nom = nom;
        this.programme = DEFAULT_PROGRAMME;
        this.session =DEFAULT_SESSION;
    }

    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        //TODO ajouter validation
        if(estProgrammeValide(programme)){
            this.programme = programme;
        }
    }



    public int getSession() {
        return session;
    }

    private void setSession(int session) {
        this.session = session;
    }

    public void passerSession(){

        if(session < DERNIERE_SESSION) {
            session++;
        }
        //TODO implementer la diplomation
    }

    @Override
    public String toString() {
        return  nom  +  " programme= " + programme  + ", session=" + session;
    }

    private boolean estProgrammeValide(String programme) {
        return programme.equals(PROGRAMME_INFORMATIQUE) ||programme.equals(PROGRAMME_SPORT) ||programme.equals(PROGRAMME_LETTRES);
    }
}
