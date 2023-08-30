package semaine02.methodes.calculateur;

public class TestCalculateur {
    public static void main(String[] args) {
        Calculateur calculateur= new Calculateur();
        double moyenne1 = calculateur.calculerMoyenne(2,3);
        System.out.println("moyenne = " + moyenne1);
        double moyenne2 = calculateur.calculerMoyenne(4,25);
        System.out.println("moyenne = " + moyenne2);
    }
}
