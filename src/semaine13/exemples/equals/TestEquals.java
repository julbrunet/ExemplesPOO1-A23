package semaine13.exemples.equals;

import java.time.LocalDate;


/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-11-27
 */
public class TestEquals {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDate refDate1 = date1;
        LocalDate copDate1 = LocalDate.now();


        System.out.println("date1:\t\t" + date1);
        System.out.println("refDate1:\t" + refDate1);
        System.out.println("copDate1:\t" + copDate1);

        System.out.println("date1 == refDate1 : " + (date1 == refDate1));//c'est le meme objet à la meme adress
        System.out.println("date1 == copDate1 : " + (date1 == copDate1));// c'est des objets identiques mais pas à la meme adresse

        System.out.println("date1.equals(refDate1) : " +  date1.equals(refDate1));//c'est le meme objet à la meme adresse
        System.out.println("date1.equals(copDate1): "+ date1.equals(copDate1));// c'est des objets identiques mais pas à la meme adresse


    }
}
