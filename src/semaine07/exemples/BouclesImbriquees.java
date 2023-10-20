package semaine07.exemples;

public class BouclesImbriquees {

    public static void main(String[] args) {
        BouclesImbriquees test = new BouclesImbriquees();
//        test.afficherTableauEtoiles(3,5);
 //       test.afficherTableauEtoiles(6,11);
        test.forImbriquees(5,5);
    }

    public void afficherTableauEtoiles(int nombreLignes, int nombrerColonnes) {
        for (int i = 0; i < nombreLignes; i++) {
            //on va ici contruire la i e ligne
            for (int j = 0; j < nombrerColonnes; j++) {
                //obn va construire la je colonne (de la ligne i)
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void forImbriquees(int nombreLignes, int nombrerColonnes) {
        for (int i = 0; i < nombreLignes; i++) {
            //on va ici contruire la i e ligne
            for (int j = 0; j < nombrerColonnes; j++) {
                //obn va construire la je colonne (de la ligne i)
                if( j <= i ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }

}
