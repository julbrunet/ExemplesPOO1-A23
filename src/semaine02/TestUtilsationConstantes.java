package semaine02;

/**
 * Semaine02
 *
 * @author Julien.Brunet
 * @since 2023-08-28
 */
public class TestUtilsationConstantes {

    public static final double VITESSE_LUMIERE = 29979458 ;


    public static void main(String[] args) {
        System.out.println("Voici une constante d�finie hors de la m�thode : " + VITESSE_LUMIERE);
    }

    public void test(){
        System.out.println("Voici une constante d�finie hors de la m�thode (depuis n'importe ou! : " + VITESSE_LUMIERE);
    }
}
