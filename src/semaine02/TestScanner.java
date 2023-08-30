package semaine02;


import java.util.Scanner;

/**
 * Semaine02
 *
 * @author Julien.Brunet
 * @since 2023-08-29
 */
public class TestScanner {
    public static void main(String[] args) {
        new TestScanner();
    }

    public  TestScanner(){

        Scanner outilScanner = new Scanner(System.in);

        System.out.println("Comment tu t'appelles?");
        String nom = outilScanner.nextLine();

        System.out.println("Quel age as-tu?");
        int age = outilScanner.nextInt();
        outilScanner.nextLine();//pour gerer le retour de ligne pas pris avec l'entier precedent

        System.out.println("Es tu vivant?");
        String etat = outilScanner.nextLine();


        System.out.println("Bienvenue au cours: " + nom + " (" + age + "  ans)" + etat);

        outilScanner.close();
    }
}
