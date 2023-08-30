package semaine1;

public class Exemple5 {
    public static void main(String[] args) {
		//C'est le point d'entree du programme! on affuche un petit texte
        System.out.println("Demo-126");
        //Appel du constructeur de la classe Exemple5, pas encore étudié en déatil
        new  Exemple5();
    }

    // méthode particuliere appelee Constructeur
    public Exemple5 () {
        System.out.println("On a appelé le constructeur de la classe Exemple5...");
        afficherBonjourLeMonde(); //Appel de méthode

    }

    //déclaration de méthode
    public void afficherBonjourLeMonde() {
        System.out.println("Bonjour le monde!");
    }

	//déclaration de méthode
 /*   public void afficherBonjourLeMondeV2() {
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

*/
}
