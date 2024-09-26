package semaine02;

public class Recherche {
    public static void main(String[] args) {
        final double[] TABLE = {12,-5.4,7,7.2,-6,6,4,78,2};
        final double VALEUR_A_TROUVER =4;
        boolean estTrouvee = false;

        int positionTrouvee=-1;
        for (int i = 0; i < TABLE.length && !estTrouvee; i++) {
            double elementCourant = TABLE[i];
            if(elementCourant == VALEUR_A_TROUVER) {
                estTrouvee=true;
                positionTrouvee=i;
            }
        }
        String resultat = "";
        if(estTrouvee) {
            resultat = "valeur: " + VALEUR_A_TROUVER + " trouvée au rang: "+ positionTrouvee;
        }
        else {
            resultat = "valeur: " + VALEUR_A_TROUVER + " pas trouvée.";
        }
        System.out.println(resultat);
    }
}
