package semaine03.exercices;


/**
 * ExemplesPOO1.iml
 *
 * @author Julien.Brunet
 * @since 2024-09-11
 */
public class Exercice2 {
    public static int methode1(int x, int y) {
        int nb = x++;
        return (x + nb + y);
    }

    public static void methode2(int x) {
        int y = 5;
        System.out.println("x + y : " + (x + y));
        x++;
        y--;
        System.out.println("x + y : " + (x + y + 2));
    }

    public static void main(String[] args) {
        int x = 0, y = 5;
        x = methode1(3, 5);
        System.out.println("x : " + x);
        methode2(x);
        System.out.println("x : " + x);
        methode2(y);
        System.out.println("y : " + y);
        System.out.println(methode1(methode1(x, y), y));
    }
}
