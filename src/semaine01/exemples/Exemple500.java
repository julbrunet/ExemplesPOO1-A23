package semaine01.exemples;

public class Exemple500 {
    public static void main(String[] args) {
		//C'est le point d'entree du programme! on affiche un petit texte
        System.out.println("Début - Démo - 126");

        //Instancie un objet de la classe Exemple5 qui va etre utile pour appeler les méthodes de la classe!
        Exemple500 programme = new Exemple500();

        programme.afficherBonjourLeMonde(); //Appel de méthode


        System.out.println("Fin - Démo - 126");

    }


    //déclaration de méthode
    public void afficherBonjourLeMonde() {
        System.out.println("Bonjour le monde!");
    }



}
