package semaine13.exemples.liens;



/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-11-28
 */
public class GroupeClasse {

    public static final int MAX_NOMBRE_ETUDIANTS = 26;

    private String nom;

    private Etudiant[] etudiants = new Etudiant[MAX_NOMBRE_ETUDIANTS];

    //attribut servant à des problematiqeue interne d'implémentation
    private int nombreEtudiant = 0;

    public GroupeClasse(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    public Etudiant[] getEtudiants() {
        return etudiants;
    }

    private void setEtudiants(Etudiant[] etudiants) {
        this.etudiants = etudiants;
    }

    public void ajouterEtudiant(Etudiant etudiant) {

        if (nombreEtudiant < MAX_NOMBRE_ETUDIANTS) {
            etudiants[nombreEtudiant] = etudiant;
            nombreEtudiant++;
        } else {
            System.out.println("Impossible, le groupe est plein...");
        }

    }

    public int nombreEtudiants() {
        return nombreEtudiant;
    }

    @Override
    public String toString() {
        return nom + " avec " + nombreEtudiants() + " etudiants.";
    }

    public String[] listeNomsEtudiants() {
        String[] noms = new String[nombreEtudiant];
        for (int i = 0; i < nombreEtudiant; i++) {
            noms[i] = etudiants[i].getNom();
        }

        return noms;
    }
}
