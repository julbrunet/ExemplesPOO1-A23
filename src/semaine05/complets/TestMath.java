package semaine05.complets;

/**
 * ExemplesPOO1
 *
 * @author julien.brunet
 * @since 2023-09-15
 */
public class TestMath {

    public static void main(String[] args) {

        int d;
        do {
            d =  ((int) (Math.random()*76))+1950;
            System.out.println("Nombre au hasard: " + d);
        }while(d>=1950 && d<=2025);

    }
}
