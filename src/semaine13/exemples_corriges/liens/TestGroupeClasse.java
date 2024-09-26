package semaine13.exemples_corriges.liens;

import java.util.Arrays;

/**
 * CoursPOO1 - semaine12.exemples_solutions.liens
 *
 * @author Julien.Brunet
 * @since 2022-11-16
 */
public class TestGroupeClasse {
    public static void main(String[] args) {
        Etudiant et1 = new Etudiant("Jean", Etudiant.INFORMATIQUE);
        Etudiant et2 = new Etudiant("Jules", Etudiant.INFORMATIQUE);
        Etudiant et3 = new Etudiant("Georges", Etudiant.LETTRES);
        GroupeClasse classe = new GroupeClasse("Classe de test");

        System.out.println(classe);
        classe.addEtudiant(et1);
        System.out.println(classe);

        classe.addEtudiant(et2);
        System.out.println(classe);
        classe.addEtudiant(et3);
        System.out.println(classe);

        System.out.println(Arrays.toString(classe.listeNomsEtudiants()));
        for (int i = 0; i < 30; i++) {
            Etudiant et = new Etudiant("Etudiant "+ i, Etudiant.LETTRES);
            classe.addEtudiant(et);
        }
        System.out.println(classe);
        System.out.println(Arrays.toString(classe.listeNomsEtudiants()));



    }
}
