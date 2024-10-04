package semaine13.exemples.equals;


/**
 * ExemplesPOO1.iml
 *
 * @author Julien.Brunet
 * @since 2024-10-04
 */
public class TestStringEquals {
    public static void main(String[] args) {
        String ch1 = "toto";
        String ch2 = "toto";
        String ch3 ="tototo";
        ch3=ch3.substring(0,4);

        System.out.println("ch1:\t" + ch1);
        System.out.println("ch2:\t" + ch2);
        System.out.println("ch3:\t" + ch3);


        System.out.println("ch1 == ch2 : " + (ch1 == ch2));//c'est la meme adresse (Optimisation de la memoire du JDK)
        System.out.println("ch1 == ch3 : " + (ch1 == ch3));//c'est pas à la meme adresse!

        System.out.println(" ch1.equals(ch2): " +  ch1.equals(ch2));//c'est pas le meme objet, mais le meme contenu
        System.out.println(" ch1.equals(ch3): " +  ch1.equals(ch3));//c'est pas le meme objet, mais le meme contenu

    }
}
