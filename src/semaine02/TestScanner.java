package semaine02;

import java.util.Scanner;



/**
 * ExemplesPOO1.iml 
 * @author Julien.Brunet 
 * @since 2024-09-06
 */
public class TestScanner {
    public static void main(String[] args) {
        TestScanner test=new TestScanner();
        test.demanderrInfoEtAfficher();
    }

    public void demanderrInfoEtAfficher() {

        Scanner  saisie = new Scanner(System.in);
        System.out.println("Comment t'appelles-tu? ");
        String nom = saisie.nextLine();

        System.out.println("Quel age as-tu? ");
        int age = saisie.nextInt();

        System.out.println("Quel es ton poids? ");
        double poids = saisie.nextDouble();

        //pour gerer le probleme de scanner
        saisie.nextLine();

        System.out.println("Quel est ta nationalite?");
        String nationalite= saisie.nextLine();

        System.out.println(" Bienvenue "+ nom);
        System.out.println(" tu as  "+ age + " ans");
        System.out.println(" tu peses  "+ poids + " kg");
        System.out.println(" tu viens du  "+nationalite);




    }


}
