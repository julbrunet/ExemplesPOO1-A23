package semaine03.exercices;


/**
 * ExemplesPOO1.iml
 *
 * @author Julien.Brunet
 * @since 2024-09-11
 */
public class Exercice1 {
    public int methode1(int x, int y) {
        return (x + y) * 2;
    }

    public void methode2(int x) {
        System.out.println("x : " + x);
        x++;
        System.out.println("x : " + x);
    }

    public static void main(String[] args) {
        Exercice1 exercice1 = new Exercice1();
        int nombre = 0;
        nombre = exercice1.methode1(3, 5);
        System.out.println(" nombre : " + nombre);
        exercice1.methode2(nombre);
        System.out.println(" nombre : " + nombre);
    }
}
