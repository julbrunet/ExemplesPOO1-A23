package semaine07.exemples_corriges;

public class BouclesImbriquees {

    public static final int NOMBRES_LIGNES = 3;
    public static final int NOMBRES_COLONNES = 5;

    public static void main(String[] args) {
        BouclesImbriquees test = new BouclesImbriquees();

        test.afficherTableauEtoiles(3, 5);
        test.afficherTableauEtoiles(6, 11);

        test.forImbriquees(5, 5);
    }

    private void afficherTableauEtoiles(int nombreLignes, int nombrerColonnes) {
        for (int i = 0; i < nombreLignes; i++) {
            for (int j = 0; j < nombrerColonnes; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void forImbriquees(int nombreLignes, int nombrerColonnes) {
        for (int i = 0; i < nombreLignes; i++) {
            for (int j = 0; j < nombrerColonnes; j++) {
                if (i > j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

