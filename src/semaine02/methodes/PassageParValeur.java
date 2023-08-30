package semaine02.methodes;

public class PassageParValeur {
    public void calculerCarre(int pNombre) {
        pNombre *= pNombre;
        System.out.println("Pendant la méthode: " + pNombre);
    }

    public static void main(String[] args) {
        int nombre = 10;
        PassageParValeur obj = new PassageParValeur();
        System.out.println("Avant la méthode: " + nombre);
        obj.calculerCarre(nombre);
        System.out.println("Apres la méthode: " + nombre);
    }

}


