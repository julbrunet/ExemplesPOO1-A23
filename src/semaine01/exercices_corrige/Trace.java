package semaine01.exercices_corrige;


/**
 * ExemplesPOO1.iml
 *
 * @author Julien.Brunet
 * @since 2024-08-23
 */
public class Trace {

    public void tracer() {
        System.out.println("A");
    }

    public void ecrireMessage() {
        System.out.print("B");
    }

    public static void main(String[] args) {
        System.out.println("C");
        Trace exercice = new Trace();

        System.out.print("D");
        exercice.ecrireMessage();

        System.out.println("E");
        exercice.tracer();

        System.out.println("F");
    }
}

