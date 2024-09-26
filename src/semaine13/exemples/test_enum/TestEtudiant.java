package semaine13.exemples.test_enum;


/**
 * CoursPOO1 - semaine13.exemples_solutions
 *
 * @author Julien.Brunet
 * @since 2022-11-11
 */
public class TestEtudiant {

    public static void main(String[] args) {
        Etudiant et1 = new Etudiant("Jean");
        Etudiant et2 = new Etudiant("Jules", Etudiant.Programme.INFORMATIQUE);
        et2.changerSession();
        Etudiant et3 = new Etudiant("Georges", Etudiant.Programme.LETTRES);

        System.out.println(et1);
        System.out.println(et2);
        System.out.println(et3);

    }
}
