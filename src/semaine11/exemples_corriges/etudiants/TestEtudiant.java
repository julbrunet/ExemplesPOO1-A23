package semaine11.exemples_corriges.etudiants;

import java.util.Calendar;

/**
 * CoursPOO1 - semaine12.exemples_solutions
 *
 * @author Julien.Brunet
 * @since 2022-11-11
 */
public class TestEtudiant {

    public static void main(String[] args) {
        Etudiant et1 = new Etudiant("Jean", Etudiant.PROGRAMME_INFORMATIQUE);
        Etudiant et2 = new Etudiant("Jacques", "Bidon");
        Etudiant et3 = new Etudiant("Jules", Etudiant.PROGRAMME_LETTRES);
        Etudiant et4 = new Etudiant("Georges", Etudiant.PROGRAMME_INFORMATIQUE);

        System.out.println(et1);
        System.out.println(et2);
        System.out.println(et3);
        System.out.println(et4);

        et1.setProgramme("Bidon");
        System.out.println(et1);

        et1.changerSession();
        System.out.println(et1);
        et1.changerSession();
        System.out.println(et1);
        et1.changerSession();
        System.out.println(et1);
        et1.changerSession();
        System.out.println(et1);
        et1.changerSession();
        System.out.println(et1);
        et1.changerSession();
        System.out.println(et1);
        et1.changerSession();
        System.out.println(et1);
        et1.changerSession();
        System.out.println(et1);
//
        Etudiant et5 = new Etudiant("Georges", Etudiant.PROGRAMME_INFORMATIQUE);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022,8,25,12,0,0);
        Etudiant et6 = new Etudiant("Georges", Etudiant.PROGRAMME_INFORMATIQUE,calendar.getTime());

        System.out.println("Etudiant 5 est entre avant etudiant 6? : " +  et5.estEntreAvant(et6));
        System.out.println("Etudiant 6 est entre avant etudiant 5? : " +  et6.estEntreAvant(et5));
    }
}
