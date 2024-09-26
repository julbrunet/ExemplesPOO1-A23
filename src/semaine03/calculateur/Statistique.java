package semaine03.calculateur;


import java.util.Scanner;

/**
 * ExemplesPOO1.iml
 *
 * @author Julien.Brunet
 * @since 2024-09-12
 */
public class Statistique {
    public static void main(String[] args) {
        Statistique stat= new Statistique();

        double moyenne1 =  stat.calculerMoyenne(2,3);

        double moyenne2 =  stat.calculerMoyenne(5,10);

        double moyenneDesMoyennes = stat.calculerMoyenne(moyenne1,moyenne2);
        System.out.println("Moyenne des moyennes: " + moyenneDesMoyennes);
//

//        System.out.print("Premier nb: ");
//        double premier = sc.nextDouble();
//        System.out.print("Deuxieme nb: ");
//        double deuxieme = sc.nextDouble();
//
//        double resultat = stat.calculerMoyenne(premier,deuxieme);
//
//        System.out.println(resultat);

    }

    public double calculerMoyenne(double a,double b) {
        double moyenne = (a + b) / 2;
        return moyenne;
       // System.out.println(moyenne);
    }

    public double calculerMoyenne(double a,double b,double c) {
        double moyenne = (a + b + c) / 3;
        return moyenne;

    }
}
