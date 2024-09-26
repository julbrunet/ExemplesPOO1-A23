package semaine13.exemples_corriges.equals;

import java.util.Calendar;
import java.util.Date;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-11-27
 */
public class TestEquals {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date1 = calendar.getTime();
        Date refDate1 = date1;
        Date copDate1 = calendar.getTime();
        System.out.println("date1:\t\t" + date1);
        System.out.println("refDate1:\t" + refDate1);
        System.out.println("copDate1:\t" + copDate1);

        System.out.println("date1 == refDate1 : " + (date1 == refDate1));//c'est le meme objet à la meme adress
        System.out.println("date1 == copDate1 : " + (date1 == copDate1));// c'est des objets identiques mais pas à la meme adresse

        System.out.println("date1.equals(refDate1) : " +  date1.equals(refDate1));//c'est le meme objet à la meme adresse
        System.out.println("date1.equals(copDate1): "+ date1.equals(copDate1));// c'est des objets identiques mais pas à la meme adresse


    }
}
