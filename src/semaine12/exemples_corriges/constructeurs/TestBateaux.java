package semaine12.exemples_corriges.constructeurs;

/**
 * CoursPOO1 - semaine11.exemples.constructeurs
 *
 * @author Julien.Brunet
 * @since 2022-11-08
 */
public class TestBateaux {
    public static void main(String[] args) {
        Bateau bateauVide = new Bateau();

        System.out.println("Premier bateau "+ bateauVide);

        Bateau bateauPret = new Bateau(45,"Bleu", "Veloce");

        System.out.println("Premier bateau "+ bateauPret);

    }
}
