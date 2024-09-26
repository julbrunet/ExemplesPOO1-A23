package semaine01;

public class Exemple5Bis {
    public static void main(String[] args) {
		//C'est le point d'entree du programme! on affiche un petit texte
        System.out.println("Demo-126");

        //Instancie un objet de la classe Exemple5Bis qui va etre utile pour appeler les méthodes de la classe!
        Exemple5Bis programme = new Exemple5Bis();

        programme.afficherBonjourLeMonde(); //Appel de méthode

        programme.afficherBonjourLeMondeV2(); //Appel de méthode

        programme.afficher1Plus1(); //Appel de méthode

        programme.afficherBonjourLeMonde(); //Appel de méthode
    }


    //déclaration de méthode
    public void afficherBonjourLeMonde() {
        System.out.println("Bonjour le monde!");
    }

	//déclaration de méthode
    public void afficherBonjourLeMondeV2() {
        System.out.print("Bonjour");
        System.out.print(" le");
        System.out.print(" monde!!!!");
    }

	//déclaration de méthode
    public void afficher1Plus1() {
        System.out.println("");
        System.out.print("1 + 1 = ");
        System.out.println(1 + 1);
    }

    public void afficherAgePereDeLucV1() {
        System.out.print("Le père de Luc a ");
        System.out.print(15 * 3);
        System.out.println(" ans.");
    }


}
