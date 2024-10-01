package semaine05;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-09-15
 */
public class TestMath {

    public static void main(String[] args) {

        boolean probleme = false;

        do{
            int annee = (int) (Math.random()*77) + 1950;

            System.out.println(annee);
            if(annee<1950||annee >2025) {
                probleme=true;
                System.out.println("bug!!!!!!");
            }

        }while(!probleme);

    }
}
