package semaine12.exemples_corriges.ordinateur;

/**
 * CoursPOO1 - semaine11.exemples_corriges.ordinateur
 *
 * @author Julien.Brunet
 * @since 2022-11-08
 */
public class TestOrdinateur {
    public static void main(String[] args) {
        Ordinateur ordi1 = new Ordinateur();
        System.out.println();
        Ordinateur ordi2 = new Ordinateur(16,512);
        System.out.println();
        Ordinateur ordi3 = new Ordinateur(64,1024,"WINDOZE");
        System.out.println();

        System.out.println(ordi1);
        System.out.println(ordi2);
        System.out.println(ordi3);

    }
}
