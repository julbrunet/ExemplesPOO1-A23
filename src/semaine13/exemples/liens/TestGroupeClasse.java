package semaine13.exemples.liens;

import java.util.Arrays;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-11-28
 */
public class TestGroupeClasse {

    public static void main(String[] args) {
        GroupeClasse test1 = new GroupeClasse("Groupe 4");
        System.out.println(test1);

        Etudiant premier = new Etudiant("Alain");
        test1.ajouterEtudiant(
premier);
        System.out.println(test1);

        for (int i = 0; i < 30; i++) {
            Etudiant ieme = new Etudiant("et " + i);
            test1.ajouterEtudiant(ieme);
        }
        System.out.println(test1);
        System.out.println(Arrays.toString(test1.listeNomsEtudiants()));

        Etudiant et = test1.getEtudiants()[7];
        if (et != null) {
            et.changerSession();
        }

    }
}
