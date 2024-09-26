package semaine12.exemples_corriges.modif_static;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-11-13
 */
public class TestEmploye {
    public static void main(String[] args) {
        Employe employe1 =new Employe("Albert Premier");
        Employe employe2 =new Employe("Beatrice Seconde");
        Employe employe3 =new Employe("Charles Trois");

        System.out.println(employe1);
        System.out.println(employe2);
        System.out.println(employe3);

        System.out.println("Le nombre d'employes crées jusque-la est de " + Employe.getNombreEmployesExistant());
        Employe employe4 =new Employe("David Four");
        System.out.println(employe4);

        System.out.println("Le nombre d'employes crées jusque-la est de " + Employe.getNombreEmployesExistant());


    }

}