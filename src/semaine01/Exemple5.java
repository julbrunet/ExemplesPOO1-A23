package semaine01;

public class Exemple5 {
    //déclaration de la méthode main, c’est le point d’entrée du programme
    public static void main(String[] args) {
        System.out.println("Exécution du main de la classe Exemple4");         //instanciation de la classe Exemple4, encore un peu mystérieux…
        Exemple5 programme = new Exemple5();         //Appel de la méthode afficherBonjourLeMonde sur l'objet appelé programme
        //c’est ce qui va provoquer l’exécution du code de la méthode
        programme.afficherBonjourLeMonde();
        //autre appel de méthode
        programme.afficher1Plus1();
        //Une méthode peut etre appelée plusieurs fois!!
        programme.afficherBonjourLeMonde();
    }

    //déclaration d’une méthode appelée afficherBonjourLeMonde
    public void afficherBonjourLeMonde() {
        System.out.println("Bonjour le monde!");
    }

    //déclaration d’une méthode appelée afficher1Plus1
    public void afficher1Plus1() {
        System.out.println("");
        System.out.print("1 + 1 = ");
        System.out.println(1 + 1);
    }
}
