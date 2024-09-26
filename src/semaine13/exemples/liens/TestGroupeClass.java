package semaine13.exemples.liens;

import java.util.Arrays;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-11-24
 */
public class TestGroupeClass {

    public static void main(String[] args) {


        GroupeClasse classe1 = new GroupeClasse("POO2");

        System.out.println(classe1);
        ;

        Etudiant et1 = new Etudiant("Albert");
        Etudiant et2 = new Etudiant("Brigitte");
        Etudiant et3 = new Etudiant("Charles");


        classe1.ajouterEtudiant(et1);
        classe1.ajouterEtudiant(et2);
        classe1.ajouterEtudiant(et3);

        System.out.println(Arrays.toString(classe1.listeNomsEtudiants()));

    }
}

