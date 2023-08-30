public class Exemple4 {
    public static void main(String[] args) {
        System.out.println (1 + 1); //Affiche 2
        System.out.println (4 + 1); //Affiche 5
        System.out.println (6 * 3); //Affiche 18
        System.out.println (9 / 3); //Affiche 3
        //Avec des parenthese pour les problemes de priorite des operations
        System.out.println (9 / 3 - 2); //Affiche 1
        System.out.println (9 / (3 - 2)); //Affiche 9
		//Attention un langage de programmation peut parfois surprendre...
		System.out.println (10.0 / 3.0); //Affiche ??
    }
}
