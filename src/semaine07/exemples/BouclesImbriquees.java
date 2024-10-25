package semaine07.exemples;

public class BouclesImbriquees {

    public static void main(String[] args) {
        BouclesImbriquees test = new BouclesImbriquees();
        test.afficherTableauEtoiles(3,5);
        test.afficherTableauEtoiles(6,11);
        test.forImbriquees(5,5);
    }

    public void afficherTableauEtoiles(int nombreLignes, int nombrerColonnes) {

        for (int i = 0; i < nombreLignes; i++) {
            //Afficher une ligne d'etoiles
            for (int j = 0; j < nombrerColonnes; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public void forImbriquees(int nombreLignes, int nombrerColonnes) {

        for (int i = 0; i < nombreLignes; i++) {
            //Afficher une ligne d'etoiles
            for (int j = 0; j < i+1; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }

    }

}
