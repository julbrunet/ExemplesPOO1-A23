package semaine13.exemples_corriges.liens;


/**
 * CoursPOO1 - semaine12.exemples_solutions
 *
 * @author Julien.Brunet
 * @since 2022-11-11
 */
public class TestEtudiant {

    public static void main(String[] args) {
        Etudiant et1 = new Etudiant("Jean");
        Etudiant et2 = new Etudiant("Jules", Etudiant.INFORMATIQUE);
        Etudiant et3 = new Etudiant("Georges", Etudiant.LETTRES);


        System.out.println(et1);
        et1.setTuteur(et2);
        System.out.println(et1);
        et1.setTuteur(et3);
        System.out.println(et1);
        et1.removeTuteur();
        System.out.println(et1);



    }
}
